package backups;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * SnowFlake算法生成id的结果是一个64bit大小的整数
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * +         |                                                     |                 |                 +
 * +    0    |   00000000 00000000 00000000 00000000 00000000 0    |   00000000 00   |   00000000 0000 +
 * +    ↑    |   ↑↑↑↑↑↑↑↑ ↑↑↑↑↑↑↑↑ ↑↑↑↑↑↑↑↑ ↑↑↑↑↑↑↑↑ ↑↑↑↑↑↑↑↑ ↑    |   ↑↑↑↑↑↑↑↑ ↑↑   |   ↑↑↑↑↑↑↑↑ ↑↑↑↑ +
 * + 符号位(+)|                     41位的时间戳                      |   10位机器编码    |     12位序列号   +
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * 符号位(+) : 平常不会用到，二进制中最高位为1的都是负数，但是我们生成的id一般都使用整数，所以这个最高位固定是0。
 * 时间戳（毫秒） : 表示$2^{41}-1$个毫秒的值，减1是因为可表示的数值范围是从0开始算的，而不是1，可记录69年时间。
 * 机器编码 : 记录工作机器id，包括5位datacenterId和5位workerId。
 * 序列号 : 可以表示的最大正整数是$2^{12}-1 = 4095, 表示同一机器同一时间截（毫秒)内产生的4095个ID序号。
 *
 * SnowFlake可以保证 :
 * 1.所有生成的id按时间趋势递增
 * 2.整个分布式系统内不会产生重复id（因为有datacenterId和workerId来做区分）
 *
 */

public class SnowFlake {
    Logger logger = LoggerFactory.getLogger(SnowFlake.class);
    /**
     * 初始时间戳
     */
    private long initTimestamp;
    private long lastTimestamp = -1L;

    /**
     * 分布式数据中心ID，长度5位，
     * 可以有32个数据中心，
     * 最小0，最大值31，
     * 向左平移17位
     */
    private long dataCenterId;
    private long dateCenterId_Bits = 5L;
    private long dataCenterId_MAX = -1L ^ (-1L << dateCenterId_Bits);

    /**
     * 某数据中心中一个服务器ID，长度5位，
     * 可以有32个服务器，
     * 最小0，最大值31，
     * 向左平移12位
     */
    private long workerId;
    private long workerId_Bits = 5L;
    private long workerId_MAX = -1L ^ (-1L << workerId_Bits);

    /**
     * 某服务器中产生的序列号，长度12位，
     * 每个服务器可同时生成4096个ID，
     * 最小值0，最大值4095
     */
    private long sequence;
    private long sequence_Bits = 12L;
    private long sequence_MAX = -1L ^ (-1L << sequence_Bits);

    private long timestamp_Shift = dateCenterId_Bits + workerId_Bits + sequence_Bits;
    private long dataCenterId_Shift = workerId_Bits + sequence_Bits;
    private long workerId_Shift = sequence_Bits;


    /**
     * 构造ID生成器
     * @param initTimestamp
     * @param dataCenterId
     * @param workerId
     * @param sequence
     */
    public SnowFlake(Long initTimestamp, Long dataCenterId, Long workerId, Long sequence) {
        if (System.currentTimeMillis() - initTimestamp > 2199023255551L) {
            logger.error("请不要输入过于古老(69年前)的时间戳作为初始时间戳");
        }
        if (dataCenterId > dataCenterId_MAX || dataCenterId < 0) {
            throw new IllegalArgumentException(String.format("SnowFlake.dataCenterId 不能大于 %d or 或者小于 0", dataCenterId_MAX));
        }
        if (workerId > workerId_MAX || workerId < 0) {
            throw new IllegalArgumentException(String.format("SnowFlake.workerId 不能大于 %d 或者小于 0", workerId_MAX));
        }
        logger.info("SnowFlake正在初始化...");
        logger.info("SnowFlake初始时间戳：%d, 数据中心编号：%d, 服务器编号：%d, 序列号：%d ...%n",
                initTimestamp, dataCenterId, workerId, sequence);

        this.initTimestamp = initTimestamp;
        this.dataCenterId = dataCenterId;
        this.workerId = workerId;
        this.sequence = sequence;
    }

    /**
     * 获取下一个ID
     * @return
     */
    public synchronized long nextId() {
        long now = timeGen();
        if (now < lastTimestamp) {
            System.err.printf("服务器发生时间回退，时间戳为 %d 之后才能继续生成ID", lastTimestamp);
            throw new RuntimeException(String.format("时间回退，%d 毫秒之后才能继续生成ID",
                    lastTimestamp - now));
        }

        if (lastTimestamp == now) {
            sequence = (sequence + 1) & sequence_MAX;
            if (sequence == 0) {
                now = tilNextMillis(lastTimestamp);
            }
        } else {
            sequence = 0;
        }

        lastTimestamp = now;

        return ((now - initTimestamp) << timestamp_Shift) |
                (dataCenterId << dataCenterId_Shift) |
                (workerId << workerId_Shift) |
                sequence;
    }

    private long tilNextMillis(long lastTimestamp) {
        long timestamp = timeGen();
        while (timestamp <= lastTimestamp) {
            timestamp = timeGen();
        }
        return timestamp;
    }

    private long timeGen() {
        return System.currentTimeMillis();
    }

    public long getInitTimestamp() {
        return initTimestamp;
    }

    public long getDataCenterId() {
        return dataCenterId;
    }

    public long getWorkerId() {
        return workerId;
    }

    public long getSequence() {
        return sequence;
    }
}

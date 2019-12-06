import backups.SnowFlake;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class IdUtils {

    private static IdUtils instance = IdUtils.getInstance();

    private static IdUtils getInstance() {
        if (instance == null) {
            instance = new IdUtils();
        }
        return instance;
    }

    /**
     * 获取32位UUID
     * 使用ThreadLocalRandom获取UUID获取更优的效果 去掉"-"
     */
    public static String get32UUID() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        return new UUID(random.nextLong(), random.nextLong()).toString().replace("-", "");
    }

    /**
     * twitter的snowflake算法生成ID，最大存储69年
     */
    private SnowFlake snowFlake = null;

    protected static SnowFlake generateSnowFlake(Long initTimestamp, Long dataCenterId, Long workerId) {
        if (instance.snowFlake == null) {
            instance.snowFlake = new SnowFlake(initTimestamp, dataCenterId, workerId, 0L);
        }
        return instance.snowFlake;
    }

    /**
     * 根据Twitter公司的snowflake算法生成下一个ID
     * 有序，无重复，效率要比UUID好
     * 但要在YML文件里配置属性，每台服务器的workid应该不一样
     * @return
     */
    public static Long getSFNextId() {
        if (instance.snowFlake == null) {
            throw new NullPointerException("SnowFlake未进行初始化，请在yml文件中配置veedo.pastoral.snow-flake相关信息");
        }
        System.out.println(instance.snowFlake.getInitTimestamp()+"|"+instance.snowFlake.getDataCenterId()+"!"+instance.snowFlake.getWorkerId());
        return instance.snowFlake.nextId();
    }

}

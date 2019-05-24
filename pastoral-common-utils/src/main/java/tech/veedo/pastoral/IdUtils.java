package tech.veedo.pastoral;

import lombok.Data;
import tech.veedo.pastoral.backups.SnowFlake;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 生成ID的工具类
 */
@Data
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

    public static SnowFlake generateSnowFlake(Long initTimestamp, Long dataCenterId, Long workerId) {
        if (instance.snowFlake == null) {
            instance.snowFlake = new SnowFlake(initTimestamp, dataCenterId, workerId, 0L);
        }
        return instance.snowFlake;
    }

    public static Long getSFNextId() {
        if (instance.snowFlake == null) {
            instance.snowFlake = new SnowFlake(System.currentTimeMillis(), 0L, 0L, 0L);
        }
        return instance.snowFlake.nextId();
    }



}

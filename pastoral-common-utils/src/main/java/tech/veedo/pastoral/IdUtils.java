package tech.veedo.pastoral;

import tech.veedo.pastoral.backups.SnowFlake;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 生成ID的工具类
 */
public class IdUtils {

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
    private static SnowFlake snowFlake = null;

    protected static void generateSnowFlake(Long dataCenterId, Long workerId) {
        if (snowFlake == null) {
            snowFlake = new SnowFlake(System.currentTimeMillis(), dataCenterId, workerId, 0L);
        }
    }

    public static Long getSFnextId() {
        if (snowFlake == null) {
            snowFlake = new SnowFlake(System.currentTimeMillis(), 0L, 0L, 0L);
        }
        return snowFlake.nextId();
    }



}

package tech.veedo.pastoral;


import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

public class MethodExecTimeStatistics {

    class Timer {
        Long startimePoint;
        Long endtimePoint;

        public Long getStartimePoint() {
            return startimePoint;
        }

        public Timer setStartimePoint(Long startimePoint) {
            this.startimePoint = startimePoint;
            return this;
        }

        public Long getEndtimePoint() {
            return endtimePoint;
        }

        public Timer setEndtimePoint(Long endtimePoint) {
            this.endtimePoint = endtimePoint;
            return this;
        }
    }

    private Logger logger = Logger.getAnonymousLogger();

    private ConcurrentHashMap<String, Timer> timers;

    /**
     * 代码片段执行起始时间记录
     * @param gist
     * @return
     */
    public boolean start(String gist) {
        if (gist == null || gist.length() <= 0) {
            return false;
        }
        if (timers == null) {
            timers = new ConcurrentHashMap<>();
        }

        Timer current = timers.get(gist);
        if (current == null) {
            timers.put(gist, new Timer().setStartimePoint(System.currentTimeMillis()));
            return true;
        } else {
            current.setStartimePoint(System.currentTimeMillis());
            return true;
        }
    }

    /**
     * 代码片段执行终结时间记录
     * @param gist
     * @return
     */
    public boolean end(String gist) {
        if (gist == null || gist.length() <= 0) {
            return false;
        }
        if (timers == null) {
            timers = new ConcurrentHashMap<>();
        }

        Timer current = timers.get(gist);
        if (current == null) {
            timers.put(gist, new Timer().setEndtimePoint(System.currentTimeMillis()));
            return true;
        } else {
            current.setEndtimePoint(System.currentTimeMillis());
            return true;
        }
    }

    /**
     * 展示代码片段执行的时长
     * @param gist
     */
    public void showExecTime(String gist) {
        if (gist == null || gist.length() <= 0) {
            logger.warning("参数为空");
        }

        Timer current;
        if (timers != null) {
            current = timers.get(gist);

            if (current != null) {
                if (current.getStartimePoint() == null || current.getEndtimePoint() == null) {
                    logger.warning(gist+"时间记录不完整");
                } else {
                    logger.warning("代码片段"+gist+"执行时间："+(current.getEndtimePoint()-current.getStartimePoint())+"ms");
                }
            } else {
                logger.warning("没有当前名称为"+gist+"的时间记录");
            }
        } else {
            logger.warning("时间列表为空");
        }
    }

}

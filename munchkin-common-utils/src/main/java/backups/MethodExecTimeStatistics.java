package backups;


import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ConcurrentHashMap;

@Slf4j
public class MethodExecTimeStatistics {

    class Timer {
        Long startimePoint;
        Long endtimePoint;

        protected Long getStartimePoint() {
            return startimePoint;
        }

        protected Timer setStartimePoint(Long startimePoint) {
            this.startimePoint = startimePoint;
            return this;
        }

        protected Long getEndtimePoint() {
            return endtimePoint;
        }

        protected Timer setEndtimePoint(Long endtimePoint) {
            this.endtimePoint = endtimePoint;
            return this;
        }
    }

    private ConcurrentHashMap<String, Timer> timers;

    /**
     * 代码片段执行起始时间记录
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
     */
    public void showExecTime(String gist) {
        if (gist == null || gist.length() <= 0) {
            log.error("参数为空");
        } else {
            Timer current;
            if (timers != null) {
                current = timers.get(gist);

                if (current != null) {
                    if (current.getStartimePoint() == null || current.getEndtimePoint() == null) {
                        log.error(gist+"时间记录不完整");
                    } else {
                        log.debug("\n========>>>代码片段 ["+gist+"] 执行时间: "+(current.getEndtimePoint()-current.getStartimePoint())+" ms.");
                    }
                } else {
                    log.error("没有当前名称为"+gist+"的时间记录");
                }
            } else {
                log.error("时间列表为空");
            }
        }
    }

    public void showAll() {
        timers.forEach((s, timer) -> {
            if (timer.getStartimePoint() == null || timer.getEndtimePoint() == null) {
                log.error(s+"时间记录不完整");
            } else {
                log.debug("\n========>>>代码片段 ["+s+"] 执行时间: "+(timer.getEndtimePoint()-timer.getStartimePoint())+" ms.");
            }
        });
    }

}

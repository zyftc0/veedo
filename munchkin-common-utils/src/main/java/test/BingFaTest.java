package test;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class BingFaTest {

    static Logger logger = LoggerFactory.getLogger(BingFaTest.class);

    // 请求总数
    public static int clientTotal = 5000;
    // 同时并发执行的线程数
    public static int threadTotal = 200;

    public static AtomicInteger count = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        ExecutorService es = Executors.newCachedThreadPool();
        // 信号量，用于控制并发的线程数
        final Semaphore semaphore = new Semaphore(threadTotal);
        // 闭锁，可以实现计数器递减
        final CountDownLatch countDownLatch = new CountDownLatch(clientTotal);

        Stream.iterate(0, i->i+1).limit(clientTotal).forEach(integer ->
                es.execute(() -> {
                    try {
                        // 执行此方法获取执行许可，当总计未释放的许可数<200时，允许执行
                        // 否则线程阻塞等待，直到获得许可
                        semaphore.acquire();
                        add();
                        // 释放许可
                        semaphore.release();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    // 闭锁减1
                    countDownLatch.countDown();
                })
        );
        // 线程阻塞，直到闭锁值为0时，线程才释放，继续往下执行
        countDownLatch.await();
        es.shutdown();
        logger.info("count: {}", count);
    }

    public static void add() {
        count.incrementAndGet();
    }

}

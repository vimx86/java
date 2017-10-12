package org.galsang.java.advanced.concurrent.blockingqueue;

import lombok.extern.java.Log;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Description： 生产者线程
 * <br /> Author： galsang
 */
@Log
public class Producer implements Runnable {

    private static final int DEFAULT_RANGE_FOR_SLEEP = 1000; // 最大休眠值

    private volatile boolean isRunning = true; // 线程是否运行

    private AtomicInteger count = new AtomicInteger(); // 队列计数

    private BlockingQueue queue; // 阻塞队列

    public Producer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        String data = null;
        Random random = new Random();
        try {
            while (isRunning) {
                log.info("正在生成数据……");
                Thread.sleep(random.nextInt(DEFAULT_RANGE_FOR_SLEEP)); // 取0~DEFAULT_RANGE_FOR_SLEEP值的一个随机数
                data = "data: " + count.incrementAndGet();  // 以原子方式将count当前值加1
                log.info("将数据 " + data + " 放入队列！");

                if (!queue.offer(data, 2, TimeUnit.SECONDS)) {//设定的等待时间为2s，如果超过2s还没加进去返回true
                    log.info("放入数据失败：" + data);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        } finally {
            log.info("退出生产者线程！");
        }

    }

    public void stop() {
        isRunning = false;
    }
}

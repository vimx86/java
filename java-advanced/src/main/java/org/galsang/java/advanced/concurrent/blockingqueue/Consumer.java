package org.galsang.java.advanced.concurrent.blockingqueue;

import lombok.extern.java.Log;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Description： 消费者线程
 * <br /> Author： galsang
 */
@Log
public class Consumer implements Runnable {

    private static final int DEFAULT_RANGE_FOR_SLEEP = 1000; // 最大休眠值
    private BlockingQueue<String> queue;

    public Consumer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        log.info("启动消费者线程……");

        boolean isRunning = true;

        try {
            while (isRunning) {
                log.info("正从队列获取数据...");
                String data = queue.poll(2, TimeUnit.SECONDS); //有数据时直接从队列的队首取走，无数据时阻塞，在2s内有数据，取走，超过2s还没数据，返回失败

                if (null != data) {
                    log.info("拿到数据：" + data);
                    log.info("正在消费数据： " + data);
                    Thread.sleep(new Random().nextInt(DEFAULT_RANGE_FOR_SLEEP));
                } else { // 超过2s还没数据，认为所有生产线程都已经退出，自动退出消费线程。
                    isRunning = false;
                }

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        } finally {
            log.info("退出消费者线程！");
        }

    }

}

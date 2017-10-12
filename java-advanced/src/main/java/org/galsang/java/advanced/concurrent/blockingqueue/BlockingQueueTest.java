package org.galsang.java.advanced.concurrent.blockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Description： 测试阻塞队列
 * <br /> Author： galsang
 */
public class BlockingQueueTest {


    public static void main(String[] args) throws InterruptedException {

        BlockingQueue<String> queue = new LinkedBlockingQueue<>(10);

        Producer p1 = new Producer(queue);
        Producer p2 = new Producer(queue);
        Producer p3 = new Producer(queue);
        Consumer c1 = new Consumer(queue);

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.execute(p1);
        executorService.execute(p2);
        executorService.execute(p3);
        executorService.execute(c1);

        // 执行10s
        Thread.sleep(10 * 1000);
        p1.stop();
        p2.stop();
        p3.stop();

        Thread.sleep(2000);

        executorService.shutdown();

    }


}

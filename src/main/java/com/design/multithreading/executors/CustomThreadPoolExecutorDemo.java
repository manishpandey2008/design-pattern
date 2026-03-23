package com.design.multithreading.executors;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class CustomThreadPoolExecutorDemo {
    public static void main(String[] args) throws InterruptedException {
        int corePoolSize = 2;
        int maxPoolSize = 4;
        long keepAlive = 10;
        BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(2);
        RejectedExecutionHandler handler = (r, e) -> {
            System.out.println("Task rejected - queue full and pool at max. Consider retry or backpressure.");
        };

        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                corePoolSize, maxPoolSize, keepAlive, TimeUnit.SECONDS,
                workQueue, handler
        );

        for (int i = 1; i <= 8; i++) {
            final int taskId = i;
            try {
                executor.execute(() -> {
                    System.out.println("Task " + taskId + " by " + Thread.currentThread().getName());
                    try { Thread.sleep(1000); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
                });
            } catch (RejectedExecutionException e) {
                System.out.println("Task " + taskId + " rejected");
            }
        }

        executor.shutdown();
        executor.awaitTermination(15, TimeUnit.SECONDS);
        System.out.println("Custom pool - core=2, max=4, queue=2");
    }
}

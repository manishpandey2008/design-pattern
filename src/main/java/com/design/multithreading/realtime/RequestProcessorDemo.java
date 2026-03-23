package com.design.multithreading.realtime;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;


public class RequestProcessorDemo {
    private static final ExecutorService requestExecutor = Executors.newFixedThreadPool(4);
    private static final AtomicLong requestId = new AtomicLong(0);

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 8; i++) {
            requestExecutor.submit(() -> {
                long id = requestId.incrementAndGet();
                System.out.println("Processing request " + id + " on " + Thread.currentThread().getName());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
                System.out.println("Request " + id + " completed");
            });
        }

        requestExecutor.shutdown();
        requestExecutor.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println("All requests processed");
    }
}

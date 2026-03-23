package com.design.multithreading.realtime;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;


public class RateLimiterDemo {
    private static final int MAX_CONCURRENT_REQUESTS = 2;
    private static final Semaphore rateLimiter = new Semaphore(MAX_CONCURRENT_REQUESTS);

    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 5; i++) {
            final int requestId = i;
            new Thread(() -> {
                try {
                    if (rateLimiter.tryAcquire(1, TimeUnit.SECONDS)) {
                        try {
                            System.out.println("Request " + requestId + " processed");
                            Thread.sleep(500);
                        } finally {
                            rateLimiter.release();
                        }
                    } else {
                        System.out.println("Request " + requestId + " rejected - rate limit");
                    }
                } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
            }).start();
        }
        Thread.sleep(4000);
        System.out.println("Rate limiter - max " + MAX_CONCURRENT_REQUESTS + " concurrent");
    }
}

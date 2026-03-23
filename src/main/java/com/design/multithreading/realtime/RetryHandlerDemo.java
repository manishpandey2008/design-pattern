package com.design.multithreading.realtime;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;


public class RetryHandlerDemo {
    private static final int MAX_RETRIES = 3;
    private static final ExecutorService executor = Executors.newSingleThreadExecutor();

    public static void main(String[] args) throws InterruptedException {
        executor.submit(() -> {
            AtomicInteger attempt = new AtomicInteger(0);
            while (attempt.get() < MAX_RETRIES) {
                try {
                    System.out.println("Attempt " + (attempt.get() + 1));
                    simulateFlakyCall();
                    System.out.println("Success");
                    return;
                } catch (RuntimeException e) {
                    attempt.incrementAndGet();
                    if (attempt.get() >= MAX_RETRIES) {
                        System.out.println("Failed after " + MAX_RETRIES + " retries");
                        return;
                    }
                    long delay = (long) Math.pow(2, attempt.get()) * 100;
                    System.out.println("Retry in " + delay + "ms");
                    try { Thread.sleep(delay); } catch (InterruptedException ex) { Thread.currentThread().interrupt(); }
                }
            }
        });

        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("Retry handler - exponential backoff");
    }

    private static void simulateFlakyCall() {
        if (Math.random() < 0.7) throw new RuntimeException("Transient failure");
    }
}

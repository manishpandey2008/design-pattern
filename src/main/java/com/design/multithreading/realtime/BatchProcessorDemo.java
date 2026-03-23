package com.design.multithreading.realtime;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;


public class BatchProcessorDemo {
    public static void main(String[] args) throws InterruptedException {
        List<String> records = List.of("R1", "R2", "R3", "R4", "R5");
        CountDownLatch latch = new CountDownLatch(records.size());
        ExecutorService executor = Executors.newFixedThreadPool(3);
        AtomicInteger processed = new AtomicInteger(0);

        for (String record : records) {
            executor.submit(() -> {
                try {
                    Thread.sleep(200);
                    processed.incrementAndGet();
                    System.out.println("Processed: " + record);
                } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
                finally { latch.countDown(); }
            });
        }

        latch.await();
        executor.shutdown();
        System.out.println("Batch complete - processed " + processed.get() + " records");
    }
}

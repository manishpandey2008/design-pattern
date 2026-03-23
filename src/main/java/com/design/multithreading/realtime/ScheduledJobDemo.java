package com.design.multithreading.realtime;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledJobDemo {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        scheduler.scheduleAtFixedRate(() -> {
            System.out.println("Health check - " + System.currentTimeMillis());
        }, 0, 2, TimeUnit.SECONDS);

        scheduler.scheduleWithFixedDelay(() -> {
            System.out.println("Cleanup job runs");
        }, 1, 3, TimeUnit.SECONDS);

        Thread.sleep(8000);
        scheduler.shutdown();
        System.out.println("Scheduled jobs - similar to @Scheduled in Spring");
    }
}

package com.design.multithreading.executors;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class ScheduledExecutorDemo {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

        scheduler.schedule(() -> System.out.println("Delayed task - runs once after 1 sec"), 1, TimeUnit.SECONDS);

        scheduler.scheduleAtFixedRate(() ->
                System.out.println("Fixed rate - every 2 sec: " + System.currentTimeMillis() % 10000),
                0, 2, TimeUnit.SECONDS);

        Thread.sleep(6500);
        scheduler.shutdown();
        scheduler.awaitTermination(2, TimeUnit.SECONDS);
        System.out.println("ScheduledExecutor - delay and fixed rate");
    }
}

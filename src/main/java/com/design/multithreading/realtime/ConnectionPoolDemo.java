package com.design.multithreading.realtime;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;


public class ConnectionPoolDemo {
    private static final int POOL_SIZE = 3;
    private static final Semaphore pool = new Semaphore(POOL_SIZE);
    private static final AtomicInteger connectionId = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 5; i++) {
            final int clientId = i;
            new Thread(() -> {
                try {
                    pool.acquire();
                    int connId = connectionId.incrementAndGet();
                    System.out.println("Client " + clientId + " got connection " + connId);
                    Thread.sleep(1000);
                    System.out.println("Client " + clientId + " released connection");
                } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
                finally { pool.release(); }
            }).start();
        }
        Thread.sleep(6000);
        System.out.println("Connection pool - max " + POOL_SIZE + " connections");
    }
}

package com.design.multithreading.synchronizers;

import java.util.concurrent.Semaphore;


public class SemaphoreDemo {
    private static final Semaphore semaphore = new Semaphore(2);

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            final int id = i;
            new Thread(() -> {
                try {
                    semaphore.acquire();
                    System.out.println("Worker " + id + " acquired permit");
                    Thread.sleep(1000);
                } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
                finally {
                    semaphore.release();
                    System.out.println("Worker " + id + " released");
                }
            }).start();
        }
    }
}

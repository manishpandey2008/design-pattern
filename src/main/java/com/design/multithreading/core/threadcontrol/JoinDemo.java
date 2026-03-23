package com.design.multithreading.core.threadcontrol;


public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {
            System.out.println("Worker started");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Worker finished");
        });
        worker.start();
        System.out.println("Main waiting for worker...");
        worker.join();
        System.out.println("Main proceeds after worker completed");
    }
}

package com.design.multithreading.core.interruption;


public class ThreadInterruptionDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Working...");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        });
        worker.start();
        Thread.sleep(1500);
        worker.interrupt();
        worker.join();
        System.out.println("Worker stopped via interruption");
    }
}

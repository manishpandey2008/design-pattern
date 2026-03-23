package com.design.multithreading.synchronization;


public class VolatileDemo {
    private static volatile boolean running = true;

    public static void main(String[] args) throws InterruptedException {
        Thread reader = new Thread(() -> {
            int iterations = 0;
            while (running) {
                iterations++;
            }
            System.out.println("Reader stopped after " + iterations + " iterations");
        });
        reader.start();
        Thread.sleep(100);
        running = false;
        reader.join();
        System.out.println("volatile ensured visibility");
    }
}

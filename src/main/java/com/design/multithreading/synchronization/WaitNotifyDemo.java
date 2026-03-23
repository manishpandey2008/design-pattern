package com.design.multithreading.synchronization;


public class WaitNotifyDemo {
    public static void main(String[] args) throws InterruptedException {
        SharedBuffer buffer = new SharedBuffer();
        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) { buffer.produce(i); Thread.sleep(100); }
            } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        });
        Thread consumer = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) { buffer.consume(); Thread.sleep(150); }
            } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        });
        producer.start();
        consumer.start();
        producer.join();
        consumer.join();
        System.out.println("Producer-Consumer completed");
    }
}

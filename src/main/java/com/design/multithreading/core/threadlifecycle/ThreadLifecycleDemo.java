package com.design.multithreading.core.threadlifecycle;


public class ThreadLifecycleDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            System.out.println("State after start: " + Thread.currentThread().getState());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        System.out.println("State before start: " + t.getState());
        t.start();
        Thread.sleep(100);
        System.out.println("State shortly after start: " + t.getState());
        t.join();
        System.out.println("State after termination: " + t.getState());
    }
}

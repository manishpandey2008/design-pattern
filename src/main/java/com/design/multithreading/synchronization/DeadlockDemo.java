package com.design.multithreading.synchronization;


public class DeadlockDemo {
    private static final Object lockA = new Object();
    private static final Object lockB = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (lockA) {
                System.out.println("Thread1: Holding lockA");
                try { Thread.sleep(100); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
                synchronized (lockB) { System.out.println("Thread1: Got both"); }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (lockB) {
                System.out.println("Thread2: Holding lockB");
                try { Thread.sleep(100); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
                synchronized (lockA) { System.out.println("Thread2: Got both"); }
            }
        });
        t1.start();
        t2.start();
        System.out.println("Deadlock - both blocked (Ctrl+C to stop)");
    }
}

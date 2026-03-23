package com.design.multithreading.locks;

import java.util.concurrent.locks.ReentrantLock;


public class ReentrantLockDemo {
    private static final ReentrantLock lock = new ReentrantLock();
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                lock.lock();
                try { counter++; } finally { lock.unlock(); }
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                lock.lock();
                try { counter++; } finally { lock.unlock(); }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final count (expected 2000): " + counter);
    }
}

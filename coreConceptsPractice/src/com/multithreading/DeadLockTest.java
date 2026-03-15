package com.multithreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockTest {

    private final static ReentrantLock lock1=new ReentrantLock();
    private final static ReentrantLock lock2=new ReentrantLock();


    public static void main(String[] args) {

        Runnable task1 = () -> {
            try {
                if (lock1.tryLock(500, TimeUnit.MILLISECONDS)) {
                    System.out.println(Thread.currentThread().getName() + " locked lock1");
                    try {
                        Thread.sleep(100);
                        if (lock2.tryLock(500, TimeUnit.MILLISECONDS)) {
                            try {
                                System.out.println(Thread.currentThread().getName() + " locked lock2");
                            } finally {
                                lock2.unlock();
                            }
                        }
                    } finally {
                        lock1.unlock();
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        new Thread(task1,"Thread 1").start();
        new Thread(task1,"Thread 2").start();
    }

}

package com.design.multithreading.locks;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


public class ReadWriteLockDemo {
    private static final ReadWriteLock rwLock = new ReentrantReadWriteLock();
    private static String data = "initial";

    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            final int id = i;
            new Thread(() -> {
                rwLock.readLock().lock();
                try { System.out.println("Reader " + id + ": " + data); }
                finally { rwLock.readLock().unlock(); }
            }).start();
        }
        new Thread(() -> {
            rwLock.writeLock().lock();
            try { data = "updated"; System.out.println("Writer updated"); }
            finally { rwLock.writeLock().unlock(); }
        }).start();
    }
}

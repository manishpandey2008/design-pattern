package com.design.multithreading.core.threadcontrol;


public class SleepYieldDemo {
    public static void main(String[] args) {
        Thread sleepThread = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Sleep thread: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });
        Thread yieldThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Yield thread: " + i);
                Thread.yield();
            }
        });
        sleepThread.start();
        yieldThread.start();
    }
}

package com.design.multithreading.core.daemon;


public class DaemonThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread daemonThread = new Thread(() -> {
            while (true) {
                System.out.println("Daemon thread running...");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        });
        daemonThread.setDaemon(true);
        daemonThread.start();
        Thread.sleep(2000);
        System.out.println("Main exiting - JVM shuts down");
    }
}

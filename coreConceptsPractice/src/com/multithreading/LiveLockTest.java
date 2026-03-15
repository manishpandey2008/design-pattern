package com.multithreading;

class Resource{
    private volatile boolean isAllow=false;

    public boolean isAllow() {
        return isAllow;
    }

    public void setAllow(boolean allow) {
        isAllow = allow;
    }
}

public class LiveLockTest {
    public static void main(String[] args) {
        Resource resource = new Resource();
        Runnable r1 = () -> {
            while (true) {
                if (!resource.isAllow()) {
                    resource.setAllow(true);
                    System.out.println(Thread.currentThread().getName() + " got the resource");
                    try { Thread.sleep(200); } catch (InterruptedException ignored) {}
                    resource.setAllow(false);
                } else {
                    System.out.println(Thread.currentThread().getName() + " waiting...");
                    try { Thread.sleep((int)(Math.random() * 100)); } catch (InterruptedException ignored) {}
                }
            }
        };

        new Thread(r1,"Thread 1").start();
        new Thread(r1,"Thread 2").start();

    }
}

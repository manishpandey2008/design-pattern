package com.design.multithreading.threadlocal;

public class ThreadLocalDemo {
    private static final ThreadLocal<Integer> threadId = ThreadLocal.withInitial(() -> 0);

    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 3; i++) {
            final int id = i;
            Thread t = new Thread(() -> {
                threadId.set(id * 10);
                System.out.println(Thread.currentThread().getName() + ": " + threadId.get());
                threadId.remove();
            });
            t.start();
            t.join();
        }
    }
}

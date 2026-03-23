package com.design.multithreading.core.threadcreation;


public class RunnableDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new CounterTask("Counter-A", 3));
        Thread t2 = new Thread(new CounterTask("Counter-B", 3));
        t1.start();
        t2.start();
        System.out.println("Main thread continues...");
    }
}

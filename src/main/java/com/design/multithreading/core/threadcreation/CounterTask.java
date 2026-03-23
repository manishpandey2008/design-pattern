package com.design.multithreading.core.threadcreation;

public class CounterTask implements Runnable {
    private final String name;
    private final int countTo;

    public CounterTask(String name, int countTo) {
        this.name = name;
        this.countTo = countTo;
    }

    @Override
    public void run() {
        for (int i = 0; i <= countTo; i++) {
            System.out.println(name + ": " + i);
        }
    }
}

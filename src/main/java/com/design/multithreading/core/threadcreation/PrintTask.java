package com.design.multithreading.core.threadcreation;

public class PrintTask extends Thread {
    private final String taskName;
    private final int iterations;

    public PrintTask(String taskName, int iterations) {
        this.taskName = taskName;
        this.iterations = iterations;
    }

    @Override
    public void run() {
        for (int i = 1; i <= iterations; i++) {
            System.out.println(taskName + " - iteration " + i + " [Thread: " + Thread.currentThread().getName() + "]");
        }
    }
}

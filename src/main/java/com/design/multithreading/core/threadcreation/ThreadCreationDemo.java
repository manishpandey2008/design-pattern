package com.design.multithreading.core.threadcreation;

public class ThreadCreationDemo {
    public static void main(String[] args) {
        PrintTask task1 = new PrintTask("Task-A", 3);
        PrintTask task2 = new PrintTask("Task-B", 3);
        task1.start();
        task2.start();
        System.out.println("Main thread completed. Worker threads still running...");
    }
}

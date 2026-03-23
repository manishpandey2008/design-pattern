package com.design.multithreading.synchronization;

import java.util.LinkedList;
import java.util.Queue;

public class SharedBuffer {
    private final Queue<Integer> buffer = new LinkedList<>();
    private final int capacity = 5;

    public synchronized void produce(int value) throws InterruptedException {
        while (buffer.size() == capacity) wait();
        buffer.add(value);
        System.out.println("Produced: " + value + " | Buffer: " + buffer.size());
        notifyAll();
    }

    public synchronized int consume() throws InterruptedException {
        while (buffer.isEmpty()) wait();
        int value = buffer.poll();
        System.out.println("Consumed: " + value + " | Buffer: " + buffer.size());
        notifyAll();
        return value;
    }
}

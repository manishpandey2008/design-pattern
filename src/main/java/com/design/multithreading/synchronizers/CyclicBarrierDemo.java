package com.design.multithreading.synchronizers;

import java.util.concurrent.CyclicBarrier;


public class CyclicBarrierDemo {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3, () -> System.out.println("Barrier reached"));

        for (int i = 1; i <= 3; i++) {
            final int id = i;
            new Thread(() -> {
                try {
                    System.out.println("Party " + id + " arriving");
                    barrier.await();
                    System.out.println("Party " + id + " passed");
                } catch (Exception e) { e.printStackTrace(); }
            }).start();
        }
    }
}

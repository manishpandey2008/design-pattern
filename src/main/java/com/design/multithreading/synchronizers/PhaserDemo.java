package com.design.multithreading.synchronizers;

import java.util.concurrent.Phaser;

public class PhaserDemo {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(3);
        for (int i = 1; i <= 3; i++) {
            final int id = i;
            new Thread(() -> {
                System.out.println("Phase 0 - " + id);
                phaser.arriveAndAwaitAdvance();
                System.out.println("Phase 1 - " + id);
                phaser.arriveAndDeregister();
            }).start();
        }
    }
}

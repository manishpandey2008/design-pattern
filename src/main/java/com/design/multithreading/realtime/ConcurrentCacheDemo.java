package com.design.multithreading.realtime;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class ConcurrentCacheDemo {
    private static final Map<String, String> cache = new ConcurrentHashMap<>();

    public static void main(String[] args) throws InterruptedException {
        cache.put("user:1", "Alice");
        cache.put("user:2", "Bob");

        for (int i = 1; i <= 3; i++) {
            final int id = i;
            new Thread(() -> {
                String key = "user:" + id;
                String value = cache.computeIfAbsent(key, k -> "Computed-" + k);
                System.out.println(Thread.currentThread().getName() + " get " + key + " = " + value);
            }).start();
        }

        Thread.sleep(1000);
        System.out.println("Cache entries: " + cache);
    }
}

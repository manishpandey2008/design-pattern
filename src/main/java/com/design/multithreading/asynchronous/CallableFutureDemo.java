package com.design.multithreading.asynchronous;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class CallableFutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(() -> {
            Thread.sleep(500);
            return 42;
        });
        System.out.println("Doing other work...");
        Integer result = future.get();
        System.out.println("Result: " + result);
        executor.shutdown();
    }
}

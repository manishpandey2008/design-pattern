package com.design.multithreading.asynchronous;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> {
            System.out.println("Async task 1");
            return "Hello";
        }).thenApply(s -> s + " World")
          .thenApply(s -> s + "!")
          .thenAccept(r -> System.out.println("Result: " + r))
          .join();
        System.out.println("CompletableFuture chain completed");
    }
}

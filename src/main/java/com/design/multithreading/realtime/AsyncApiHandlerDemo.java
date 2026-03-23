package com.design.multithreading.realtime;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsyncApiHandlerDemo {
    private static final ExecutorService executor = Executors.newFixedThreadPool(4);

    public static void main(String[] args) throws InterruptedException {
        simulateAsyncApiCall("user/123").thenAccept(response ->
                System.out.println("Response: " + response));

        simulateAsyncApiCall("order/456").thenApply(r -> "Order: " + r)
                .thenAccept(System.out::println);

        CompletableFuture.allOf(
                simulateAsyncApiCall("product/1"),
                simulateAsyncApiCall("product/2"),
                simulateAsyncApiCall("product/3")
        ).thenRun(() -> System.out.println("All product calls completed")).join();

        executor.shutdown();
        executor.awaitTermination(2, java.util.concurrent.TimeUnit.SECONDS);
    }

    private static CompletableFuture<String> simulateAsyncApiCall(String path) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(300);
                return "{\"id\":\"" + path + "\",\"status\":\"ok\"}";
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
        }, executor);
    }
}

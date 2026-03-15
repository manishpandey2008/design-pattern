package com.multithreading;


import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> cf=CompletableFuture.supplyAsync(()->{
            try{
                Thread.sleep(100);
            }catch (Exception ex) {
                throw new RuntimeException(ex);
            }
            return "HI";
        }).thenApplyAsync((a)-> a+ " Hello")
                .whenComplete(System.out::printf);
        System.out.println(cf.get());
    }
}

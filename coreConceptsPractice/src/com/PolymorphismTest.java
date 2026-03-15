package com;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class PolymorphismTest {
    public static void main(String[] args) {
        ExecutorService executorService=Executors.newSingleThreadExecutor();
        executorService.execute(()-> System.out.println("HI"));
        executorService.shutdown();
    }
}

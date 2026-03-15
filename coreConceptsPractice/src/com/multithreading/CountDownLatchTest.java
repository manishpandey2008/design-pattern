package com.multithreading;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

class Test implements Callable<String>{
    private final CountDownLatch countDownLatch;

    Test(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public String call() throws Exception {
        try {
            System.out.println(Thread.currentThread().getName() + " Now in running mode");
            Thread.sleep(1000);
        }finally {
            this.countDownLatch.countDown();
        }
        return "Done";
    }
}

public class CountDownLatchTest {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        CountDownLatch countDownLatch=new CountDownLatch(5);
// Use for stop main thread.
        Future<String> f1= executorService.submit(new Test(countDownLatch));
        Future<String> f2= executorService.submit(new Test(countDownLatch));
        Future<String> f3= executorService.submit(new Test(countDownLatch));
        countDownLatch.await();
//        countDownLatch.await(100,TimeUnit.MILLISECONDS);
        System.out.println("All complated !!");
        executorService.shutdown();

    }
}

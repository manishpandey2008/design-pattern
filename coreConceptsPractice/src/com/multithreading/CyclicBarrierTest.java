package com.multithreading;

import java.util.concurrent.CyclicBarrier;

class CyclicBarrierResource implements Runnable{
    private final CyclicBarrier cyclicBarrier;

    CyclicBarrierResource(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +" Started......");
        try{
            Thread.sleep(100);
            cyclicBarrier.await();
        }catch (Exception ex){}
        System.out.println(Thread.currentThread().getName()+" Stoped ...............");
    }
}

public class CyclicBarrierTest {
    public static void main(String[] args) {
        // All thread will waiting till last thread should not complete
        CyclicBarrier cyclicBarrier=new CyclicBarrier(3,()->{
            System.out.println("All Thread competed his work !!");
        });
        Thread t1= new Thread(new CyclicBarrierResource(cyclicBarrier),"Thread 1");
        Thread t2= new Thread(new CyclicBarrierResource(cyclicBarrier),"Thread 2");
        Thread t3= new Thread(new CyclicBarrierResource(cyclicBarrier),"Thread 3");
        t1.start();
        t2.start();
        t3.start();
    }
}

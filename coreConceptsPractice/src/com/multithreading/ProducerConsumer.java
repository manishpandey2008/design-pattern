package com.multithreading;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {
    BlockingQueue<Integer> items=new ArrayBlockingQueue<>(10);

    public synchronized void addProduct(int i) throws InterruptedException {
        System.out.println("Item "+ i +" Produced");
        items.put(i);
        notifyAll();
    }

    public synchronized void consumeProduct() throws InterruptedException{
        int i=items.take();
        System.out.println("Item "+ i +" Consumed");
        notifyAll();
    }

    public static void main(String[] args) throws InterruptedException {
        ProducerConsumer producerConsumer =new ProducerConsumer();

        Thread t1=new Thread(()->{
            int i=0;
            while (true){
                i++;
                try {
                    producerConsumer.addProduct(i);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t2=new Thread(()->{
            while (true){
                try {
                    producerConsumer.consumeProduct();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
        t2.start();


    }
}

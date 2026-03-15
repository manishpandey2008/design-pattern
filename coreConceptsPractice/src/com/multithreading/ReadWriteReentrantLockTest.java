package com.multithreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class ReadWriteResource{

    private final ReadWriteLock reentrantLock=new ReentrantReadWriteLock();

    private final Lock readLock=reentrantLock.readLock();
    private final Lock writeLock=reentrantLock.readLock();


    public void writeInBook(){
        try{
            if(writeLock.tryLock(100, TimeUnit.MILLISECONDS)){
                System.out.println(Thread.currentThread().getName() +" :  Start Writing");
                try {
                    Thread.sleep(100000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println(Thread.currentThread().getName() +" :  Stop Writing");
            }else{
                System.out.println(Thread.currentThread().getName()+" : Not write in book !!");
            }
        }catch (InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }

    public void readInBook(){
        try{
            if(readLock.tryLock(100, TimeUnit.MILLISECONDS)){
                System.out.println(Thread.currentThread().getName() +" :  Start Reading");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println(Thread.currentThread().getName() +" :  Stop Reading");
            }else{
                System.out.println(Thread.currentThread().getName()+" : Not read book !!");
            }
        }catch (InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }


}

public class ReadWriteReentrantLockTest {
    public static void main(String[] args) {
        ReadWriteResource readWriteResource=new ReadWriteResource();

        new Thread(()->{
            for (int i=0;i<10;i++){
                readWriteResource.writeInBook();
                try {
                    Thread.sleep(1000);
                }catch (Exception ex){}
            }
        }).start();

        new Thread(()->{
            for (int i=0;i<10;i++){
                readWriteResource.readInBook();
                try {
                    Thread.sleep(1000);
                }catch (Exception ex){}
            }
        }).start();

    }
}

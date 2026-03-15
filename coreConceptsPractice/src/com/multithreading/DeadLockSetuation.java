package com.multithreading;

public class DeadLockSetuation {

    private Object loc1=new Object();
    private Object loc2=new Object();

    public void fun1(){
        synchronized (loc1){
            try{
                System.out.println("Lock 1 acquired");
                Thread.sleep(1000);
            }catch (InterruptedException ex){
            }

            synchronized (loc2) {
                System.out.println(Thread.currentThread().getName() + " acquired lock2");
            }
        }
    }

    public void fun12(){
        synchronized (loc2){
            try{
                System.out.println("Lock 2 acquired");
                Thread.sleep(1000);
            }catch (InterruptedException ex){
            }

            synchronized (loc1) {
                System.out.println(Thread.currentThread().getName() + " acquired lock1");
            }
        }
    }

    public static void main(String[] args) {
        DeadLockSetuation deadLockSetuation=new DeadLockSetuation();
        new Thread(deadLockSetuation::fun1,"Thread 1").start();
        new Thread(deadLockSetuation::fun12,"Thread 2").start();
    }
}

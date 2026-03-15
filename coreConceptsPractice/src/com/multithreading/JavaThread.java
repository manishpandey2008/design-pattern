package com.multithreading;


class TestThread {
    int i=0;
    public void increase() {
       synchronized (this){
           i++;
       }
    }

    public int getCount(){
        return this.i;
    }
}

class TestVisibilityProblem{
    private volatile boolean visisbility=false;

    public void setVisisbility(boolean visisbility){
        this.visisbility=visisbility;
    }

    public boolean getVisisbility(){
        return visisbility;
    }
}

public class JavaThread {
    public static void main(String[] args) throws InterruptedException {
//        TestThread testThread=new TestThread();
//        Thread t1=new Thread(()->{
//            for(int i=0;i<1000;i++){
//                testThread.increase();
//            }
//        });
//
//        Thread t2=new Thread(()->{
//            for(int i=0;i<1000;i++){
//                testThread.increase();
//            }
//        });
//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join();
//        System.out.println(testThread.getCount());


//        TestVisibilityProblem visibilityProblem=new TestVisibilityProblem();
//        Thread t1=new Thread(()->{
//            System.out.println("Thread 1 started");
//            try{
//                Thread.sleep(1000);
//            }catch (InterruptedException ex){}
//            visibilityProblem.setVisisbility(true);
//            System.out.println("Thread 1 End");
//        });
//
//        Thread t2=new Thread(()->{
//            System.out.println("Thread 2 started");
//            while (!visibilityProblem.getVisisbility()){
//            }
//            System.out.println("Thread 2 end");
//        });
//
//        t1.start();
//        t2.start();

        ThreadLocal<Integer> threadLocal=new ThreadLocal<>();
        Runnable runnable=()->{
            System.out.println(Thread.currentThread().getName()+ " started");
            threadLocal.set(1000);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(threadLocal.get());
            threadLocal.remove();
            System.out.println(Thread.currentThread().getName()+" End");
        };

        Thread t1=new Thread(runnable,"Thread 1");
        Thread t2=new Thread(runnable,"Thread 2");

        t1.start();
        t2.start();

    }
}

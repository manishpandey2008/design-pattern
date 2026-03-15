package com.multithreading;

import java.util.concurrent.*;

public class ThreadPool{
    public static void main(String[] args) {
//        ExecutorService executorService= Executors.newSingleThreadExecutor();
//        for(int i=0;i<5;i++){
//            int j=i;
//            executorService.execute(()->{
//                try{
//                    Thread.sleep(500);
//                }catch (Exception ex){}
//                System.out.println(j);
//            });
//        }
//        executorService.shutdown();

//        ExecutorService executorService= Executors.newFixedThreadPool(3);
//        for(int i=0;i<5;i++){
//            int j=i;
//            executorService.execute(()->{
//                try{
//                    Thread.sleep(500);
//                }catch (Exception ex){}
//                System.out.println(j);
//            });
//        }
//        executorService.shutdown();

//        ExecutorService executorService= Executors.newCachedThreadPool();
//        for(int i=0;i<5;i++){
//            int j=i;
//            executorService.execute(()->{
//                try{
//                    Thread.sleep(500);
//                }catch (Exception ex){}
//                System.out.println(j);
//            });
//        }
//        executorService.shutdown();

//        ScheduledExecutorService executorService= Executors.newScheduledThreadPool(3);
//        for(int i=0;i<5;i++){
//            int j=i;
//            executorService.schedule(()->{
//                System.out.println(j);
//            },1000, TimeUnit.MILLISECONDS);
//        }
//        executorService.shutdown();

        ExecutorService executorService=new ThreadPoolExecutor(3,5,1000,TimeUnit.MILLISECONDS,new ArrayBlockingQueue<>(5));

        for (int i=0;i<10;i++){
            int j=i;
            executorService.execute(()->{
                System.out.println(Thread.currentThread().getName() + " started task" + j);
                try{
                    Thread.sleep(1000);
                }catch (Exception ex){
                }
                System.out.println(Thread.currentThread().getName() + " ended task" + j);
            });
        }
    }
}

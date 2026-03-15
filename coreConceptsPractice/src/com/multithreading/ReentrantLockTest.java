package com.multithreading;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount{
    int balance=100;

    ReentrantLock reentrantLock=new ReentrantLock();


    public void withdrow(int amount) {
        System.out.println(Thread.currentThread().getName() +": Entered");
        try {
            if(reentrantLock.tryLock(10000,TimeUnit.MILLISECONDS)){
                if (amount<balance){
                    System.out.println(Thread.currentThread().getName() +" : Withdrow Process Started !!");
                    try {
                        Thread.sleep(1000);
                    }catch (Exception ex){}
                    balance-=amount;
                    System.out.println(Thread.currentThread().getName() +" : Withdrow Done!!");
                }else {
                    System.out.println(Thread.currentThread().getName() +" : Insufficient balance !!");
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(Thread.currentThread().getName() +": Exit");
    }


}



public class ReentrantLockTest {
    public static void main(String[] args) {
        int nums[]={3,4,1,2,3};
        int[] arr={nums[0],nums[1],nums[2]};
        for(int i=3;i<nums.length;i++){
            for(int j=0;j<3;j++){
                if(arr[j]>nums[i]){
                    arr[j]=nums[i]; break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.stream(arr).sum());
    }
}

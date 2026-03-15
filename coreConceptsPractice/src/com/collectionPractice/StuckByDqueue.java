package com.collectionPractice;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.function.Function;

class StuckByDqueueResource<T>{
    private final Deque<T> list= new ArrayDeque<>();
    private T minVal;

    public void push(T item){
        list.addFirst(item);
    }

    public T pop(){
        return list.removeFirst();
    }

    public T getMin(){
        return minVal;
    }
}

public class StuckByDqueue {
    public static void main(String[] args) {
        StuckByDqueueResource<Integer> stuckByDqueueResource=new StuckByDqueueResource<>();
        stuckByDqueueResource.push(10);
        stuckByDqueueResource.push(20);
        stuckByDqueueResource.push(30);
        System.out.println(stuckByDqueueResource.pop());
    }
}

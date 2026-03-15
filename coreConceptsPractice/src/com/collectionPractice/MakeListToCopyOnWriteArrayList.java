package com.collectionPractice;


import java.util.ArrayList;
import java.util.List;

class MakeListToCopyOnWriteArrayListResource<T>{
        private final List<T> list;

    MakeListToCopyOnWriteArrayListResource() {
        this.list = new ArrayList<>();
    }

    public void addElement(T item){
        list.add(item);
    }

    public void print(){
        List<T> copyList=new ArrayList<>(list);
        copyList.forEach(e->{
          try {
              Thread.sleep(1000);
              System.out.print(e);
          }catch (InterruptedException ex){}
        });
        System.out.println();
    }

}

class MakeListToCopyOnWriteArrayListResource2<T>{
    private final List<T> list;

    MakeListToCopyOnWriteArrayListResource2() {
        this.list = new ArrayList<>();
    }

    public void addElement(T item){
        synchronized (this){
            list.add(item);
        }
    }

    public void print(){
        synchronized (this){
            list.forEach(e->{
                try {
                    Thread.sleep(1000);
                    System.out.print(e);
                }catch (InterruptedException ex){}
            });
            System.out.println();
        }
    }

}

public class MakeListToCopyOnWriteArrayList {
    public static void main(String[] args) {
//        MakeListToCopyOnWriteArrayListResource<Integer> makeListToCopyOnWriteArrayListResource=
//                new MakeListToCopyOnWriteArrayListResource<>();

        MakeListToCopyOnWriteArrayListResource2<Integer> makeListToCopyOnWriteArrayListResource=
                new MakeListToCopyOnWriteArrayListResource2<>();
        new Thread(()->{
            for (int i=0;i<20;i++){
                try {
                    Thread.sleep(100);
                }catch (InterruptedException ex){}
                makeListToCopyOnWriteArrayListResource.addElement(i);
            }
        }).start();

        new Thread(()->{
            for (int i=0;i<5;i++){
                try {
                    Thread.sleep(100);
                }catch (InterruptedException ex){}
                makeListToCopyOnWriteArrayListResource.print();
            }
        }).start();
    }
}

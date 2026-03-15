package com;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

class GenTest<T>{
    private T vale;

    GenTest(T t){
        vale=t;
    }

    <V> T getVal(V v){
        System.out.println(v);
        return vale;
    }
}


public class JavaGeneric {
    public static void main(String[] args) {
//        List<? extends Integer> list=List.of(1,2,3);
//        for (Object o : list){
//            System.out.println(o);
//        }

        GenTest<Integer> genTest=new GenTest<>(10);
        System.out.println(genTest.getVal(20));

    }
}

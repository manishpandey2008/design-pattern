package com.pattern;

import java.util.Date;
import java.util.List;

class SingltonObject{

    private SingltonObject(){
    }

    private static final class SingltonObjectHolder {
        private static final SingltonObject singltonObject = new SingltonObject();
    }

    public static SingltonObject getInstance(){
        return SingltonObjectHolder.singltonObject;
    }

}

public class SingltonPattern {
    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,3,4,5,6,7,8,9,10);
        list.parallelStream().forEachOrdered(System.out::println);
        list.stream().forEach(System.out::println);

    }
}


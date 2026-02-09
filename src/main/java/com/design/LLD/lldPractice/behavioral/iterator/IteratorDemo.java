package com.design.LLD.lldPractice.behavioral.iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        MyList list = new MyList("a", "b", "c");
        for (String s : list) {
            System.out.println(s);
        }
    }
}

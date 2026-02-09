package com.design.LLD.lldPractice.creational.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        Config c1 = Config.getInstance();
        Config c2 = Config.getInstance();
        System.out.println(c1 == c2);
        System.out.println(c1.getEnv());
    }
}

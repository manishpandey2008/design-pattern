package com;

import java.util.Optional;

interface TestINterface{
    default void fun(){
        System.out.println("Default function in interface");
    }
}

public class JavaOptional implements TestINterface{
    @Override
    public void fun() {
        System.out.println("Default function in JavaOptional");
    }

    public static void main(String[] args) {
        JavaOptional javaOptional= new JavaOptional();
        javaOptional.fun();
    }
}

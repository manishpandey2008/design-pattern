package com.design.LLD.lldPractice.creational.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        User u = User.builder()
                .name("Alice")
                .email("alice@example.com")
                .age(28)
                .build();
        System.out.println(u);
    }
}

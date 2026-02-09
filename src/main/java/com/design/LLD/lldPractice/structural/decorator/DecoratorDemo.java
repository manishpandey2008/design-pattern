package com.design.LLD.lldPractice.structural.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Coffee c = new MilkDecorator(new SimpleCoffee());
        System.out.println(c.describe() + " = " + c.cost());
    }
}

package com.design.LLD.lldPractice.structural.decorator;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee wrapped) {
        super(wrapped);
    }
    @Override
    public String describe() { return wrapped.describe() + ", milk"; }
    @Override
    public double cost() { return wrapped.cost() + 0.5; }
}

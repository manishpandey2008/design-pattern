package com.design.LLD.lldPractice.structural.decorator;

public class SimpleCoffee implements Coffee {
    @Override
    public String describe() { return "Simple coffee"; }
    @Override
    public double cost() { return 2.0; }
}

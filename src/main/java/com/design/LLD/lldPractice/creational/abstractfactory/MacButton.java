package com.design.LLD.lldPractice.creational.abstractfactory;

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Mac-style button");
    }
}

package com.design.LLD.lldPractice.creational.abstractfactory;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Windows-style button");
    }
}

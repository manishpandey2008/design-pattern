package com.design.LLD.lldPractice.structural.bridge;

public class Radio implements Device {
    @Override
    public void turnOn() { System.out.println("Radio on"); }
    @Override
    public void turnOff() { System.out.println("Radio off"); }
}

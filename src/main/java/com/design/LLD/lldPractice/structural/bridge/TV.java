package com.design.LLD.lldPractice.structural.bridge;

public class TV implements Device {
    @Override
    public void turnOn() { System.out.println("TV on"); }
    @Override
    public void turnOff() { System.out.println("TV off"); }
}

package com.design.LLD.lldPractice.creational.factorymethod;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by truck");
    }
}

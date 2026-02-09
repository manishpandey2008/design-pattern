package com.design.LLD.lldPractice.creational.factorymethod;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        Logistics road = new RoadLogistics();
        road.planDelivery();
        Logistics sea = new SeaLogistics();
        sea.planDelivery();
    }
}

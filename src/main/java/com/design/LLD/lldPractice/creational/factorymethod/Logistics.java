package com.design.LLD.lldPractice.creational.factorymethod;

public abstract class Logistics {
    public void planDelivery() {
        Transport t = createTransport();
        t.deliver();
    }
    protected abstract Transport createTransport();
}

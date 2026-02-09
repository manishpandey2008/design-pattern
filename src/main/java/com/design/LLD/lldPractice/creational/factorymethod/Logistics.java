package com.design.LLD.lldPractice.creational.factorymethod;

// Subclasses decide which concrete product to create. Caller just uses createTransport().
public abstract class Logistics {
    public void planDelivery() {
        Transport t = createTransport();
        t.deliver();
    }
    protected abstract Transport createTransport();
}

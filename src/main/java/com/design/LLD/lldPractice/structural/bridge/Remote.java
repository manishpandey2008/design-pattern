package com.design.LLD.lldPractice.structural.bridge;

// Remote doesn't know if it's TV or Radio. Composition over inheritance — swap device anytime.
public abstract class Remote {
    protected final Device device;

    protected Remote(Device device) {
        this.device = device;
    }

    public void togglePower() {
        device.turnOn();
    }
}

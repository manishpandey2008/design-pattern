package com.design.LLD.lldPractice.structural.bridge;

public abstract class Remote {
    protected final Device device;

    protected Remote(Device device) {
        this.device = device;
    }

    public void togglePower() {
        device.turnOn();
    }
}

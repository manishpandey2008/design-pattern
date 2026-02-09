package com.design.LLD.lldPractice.structural.bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        Remote tvRemote = new BasicRemote(new TV());
        Remote radioRemote = new BasicRemote(new Radio());
        tvRemote.togglePower();
        radioRemote.togglePower();
    }
}

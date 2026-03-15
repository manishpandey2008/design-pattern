package com.design.LLD.lldPractice.structural.facade;

public class Facade {
    private final SubsystemA a = new SubsystemA();
    private final SubsystemB b = new SubsystemB();

    public void doTheThing() {
        a.stepOne();
        b.stepTwo();
    }
}

package com.design.LLD.lldPractice.structural.facade;

// One simple entry point instead of calling A, B, C in the right order everywhere.
public class Facade {
    private final SubsystemA a = new SubsystemA();
    private final SubsystemB b = new SubsystemB();

    public void doTheThing() {
        a.stepOne();
        b.stepTwo();
    }
}

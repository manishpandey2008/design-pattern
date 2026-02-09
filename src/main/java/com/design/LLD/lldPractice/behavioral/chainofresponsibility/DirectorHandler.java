package com.design.LLD.lldPractice.behavioral.chainofresponsibility;

public class DirectorHandler extends Handler {
    @Override
    protected boolean canHandle(int amount) {
        return amount <= 5000;
    }
    @Override
    protected void doHandle(int amount) {
        System.out.println("Director approved " + amount);
    }
}

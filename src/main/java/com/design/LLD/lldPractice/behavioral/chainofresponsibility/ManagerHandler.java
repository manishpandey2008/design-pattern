package com.design.LLD.lldPractice.behavioral.chainofresponsibility;

public class ManagerHandler extends Handler {
    @Override
    protected boolean canHandle(int amount) {
        return amount <= 1000;
    }
    @Override
    protected void doHandle(int amount) {
        System.out.println("Manager approved " + amount);
    }
}

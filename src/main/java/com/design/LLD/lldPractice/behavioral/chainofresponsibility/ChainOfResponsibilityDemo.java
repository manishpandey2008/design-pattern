package com.design.LLD.lldPractice.behavioral.chainofresponsibility;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        Handler manager = new ManagerHandler();
        Handler director = new DirectorHandler();
        manager.setNext(director);
        manager.handle(500);
        manager.handle(3000);
    }
}

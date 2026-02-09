package com.design.LLD.lldPractice.behavioral.visitor;

public class VisitorDemo {
    public static void main(String[] args) {
        Visitor v = new ConcreteVisitor();
        new ConcreteElementA().accept(v);
        new ConcreteElementB().accept(v);
    }
}

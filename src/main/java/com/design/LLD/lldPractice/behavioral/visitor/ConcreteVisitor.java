package com.design.LLD.lldPractice.behavioral.visitor;

public class ConcreteVisitor implements Visitor {
    @Override
    public void visit(ConcreteElementA a) {
        System.out.println("Visited A");
    }
    @Override
    public void visit(ConcreteElementB b) {
        System.out.println("Visited B");
    }
}

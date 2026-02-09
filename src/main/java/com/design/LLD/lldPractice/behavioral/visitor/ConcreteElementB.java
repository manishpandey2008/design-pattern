package com.design.LLD.lldPractice.behavioral.visitor;

public class ConcreteElementB implements Element {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}

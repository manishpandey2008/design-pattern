package com.design.LLD.lldPractice.behavioral.visitor;

public class ConcreteElementA implements Element {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}

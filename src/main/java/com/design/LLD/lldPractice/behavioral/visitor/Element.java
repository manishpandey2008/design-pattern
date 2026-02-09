package com.design.LLD.lldPractice.behavioral.visitor;

// Lets you add new operations over elements without changing the element classes.
public interface Element {
    void accept(Visitor v);
}

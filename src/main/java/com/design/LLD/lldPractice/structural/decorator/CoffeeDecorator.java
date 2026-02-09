package com.design.LLD.lldPractice.structural.decorator;

// Wraps another coffee and adds behaviour. Can stack: milk then sugar.
public abstract class CoffeeDecorator implements Coffee {
    protected final Coffee wrapped;

    protected CoffeeDecorator(Coffee wrapped) {
        this.wrapped = wrapped;
    }
}

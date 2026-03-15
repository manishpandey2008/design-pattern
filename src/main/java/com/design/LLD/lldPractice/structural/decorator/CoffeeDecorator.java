package com.design.LLD.lldPractice.structural.decorator;

public abstract class CoffeeDecorator implements Coffee {
    protected final Coffee wrapped;

    protected CoffeeDecorator(Coffee wrapped) {
        this.wrapped = wrapped;
    }
}

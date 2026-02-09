package com.design.LLD.lldPractice.behavioral.observer;

public class ConcreteObserver implements Observer {
    private final String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(int state) {
        System.out.println(name + " saw state " + state);
    }
}

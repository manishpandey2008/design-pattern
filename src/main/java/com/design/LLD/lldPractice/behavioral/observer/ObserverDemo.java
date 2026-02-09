package com.design.LLD.lldPractice.behavioral.observer;

public class ObserverDemo {
    public static void main(String[] args) {
        Subject sub = new Subject();
        sub.attach(new ConcreteObserver("A"));
        sub.attach(new ConcreteObserver("B"));
        sub.setState(1);
    }
}

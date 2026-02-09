package com.design.LLD.lldPractice.behavioral.mediator;

public class MediatorDemo {
    public static void main(String[] args) {
        ChatMediator m = new ConcreteMediator();
        User alice = new User("Alice", m);
        User bob = new User("Bob", m);
        m.addUser(alice);
        m.addUser(bob);
        alice.send("Hello");
    }
}

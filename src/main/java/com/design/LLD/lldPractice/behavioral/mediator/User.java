package com.design.LLD.lldPractice.behavioral.mediator;

public class User {
    private final String name;
    private final ChatMediator mediator;

    public User(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void send(String msg) {
        mediator.send(msg, this);
    }

    public void receive(String msg, User from) {
        System.out.println(name + " received: " + msg);
    }

    public String getName() {
        return name;
    }
}

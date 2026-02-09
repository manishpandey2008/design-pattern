package com.design.LLD.lldPractice.behavioral.mediator;

// Central hub. Colleagues talk through the mediator so they don't reference each other.
public interface ChatMediator {
    void send(String msg, User from);
    void addUser(User user);
}

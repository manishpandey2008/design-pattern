package com.design.LLD.lldPractice.behavioral.mediator;

public interface ChatMediator {
    void send(String msg, User from);
    void addUser(User user);
}

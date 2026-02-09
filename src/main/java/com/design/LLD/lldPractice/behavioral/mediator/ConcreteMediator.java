package com.design.LLD.lldPractice.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements ChatMediator {
    private final List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void send(String msg, User from) {
        for (User u : users) {
            if (u != from) u.receive(msg, from);
        }
    }
}

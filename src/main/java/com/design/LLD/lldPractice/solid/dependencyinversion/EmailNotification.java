package com.design.LLD.lldPractice.solid.dependencyinversion;

public class EmailNotification implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Email: " + message);
    }
}

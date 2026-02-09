package com.design.LLD.lldPractice.solid.dependencyinversion;

// Depend on abstraction. High-level code doesn't care if it's email or SMS.
public interface NotificationService {
    void send(String message);
}

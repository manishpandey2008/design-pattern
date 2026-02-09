package com.design.LLD.lldPractice.solid.dependencyinversion;

// Injected from outside — we don't new up EmailNotification here. Easy to test and swap.
public class OrderService {
    private final NotificationService notifier;

    public OrderService(NotificationService notifier) {
        this.notifier = notifier;
    }

    public void placeOrder(String orderId) {
        notifier.send("Order " + orderId + " placed.");
    }
}

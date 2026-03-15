package com.design.LLD.lldPractice.solid.dependencyinversion;

public class OrderService {
    private final NotificationService notifier;

    public OrderService(NotificationService notifier) {
        this.notifier = notifier;
    }

    public void placeOrder(String orderId) {
        notifier.send("Order " + orderId + " placed.");
    }
}

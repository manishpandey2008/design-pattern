package com.design.LLD.lldPractice.solid.dependencyinversion;

public class DependencyInversionDemo {
    public static void main(String[] args) {
        NotificationService notifier = new EmailNotification();
        OrderService orderService = new OrderService(notifier);
        orderService.placeOrder("ORD-101");
    }
}

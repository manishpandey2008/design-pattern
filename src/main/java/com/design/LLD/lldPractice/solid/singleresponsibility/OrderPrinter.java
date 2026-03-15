package com.design.LLD.lldPractice.solid.singleresponsibility;

public class OrderPrinter {
    public void print(Order order) {
        System.out.println("Order " + order.getId() + " | Amount: " + order.getAmount());
    }
}

package com.design.LLD.lldPractice.solid.singleresponsibility;

// Printing is its own concern. If we change how we display orders, we touch only this.
public class OrderPrinter {
    public void print(Order order) {
        System.out.println("Order " + order.getId() + " | Amount: " + order.getAmount());
    }
}

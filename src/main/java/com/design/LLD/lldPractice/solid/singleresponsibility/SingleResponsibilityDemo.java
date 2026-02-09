package com.design.LLD.lldPractice.solid.singleresponsibility;

public class SingleResponsibilityDemo {
    public static void main(String[] args) {
        Order order = new Order("ORD-001", 99.50);
        OrderPrinter printer = new OrderPrinter();
        printer.print(order);
    }
}

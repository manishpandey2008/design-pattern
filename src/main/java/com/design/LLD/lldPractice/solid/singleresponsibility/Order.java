package com.design.LLD.lldPractice.solid.singleresponsibility;

// One class, one job. Order just holds data — no printing or persistence here.
public class Order {
    private final String id;
    private final double amount;

    public Order(String id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public String getId() { return id; }
    public double getAmount() { return amount; }
}

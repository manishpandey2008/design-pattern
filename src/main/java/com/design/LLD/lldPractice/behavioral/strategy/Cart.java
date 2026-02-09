package com.design.LLD.lldPractice.behavioral.strategy;

public class Cart {
    private PaymentStrategy strategy;
    private int total;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void add(int amount) {
        total += amount;
    }

    public void checkout() {
        if (strategy != null) strategy.pay(total);
    }
}

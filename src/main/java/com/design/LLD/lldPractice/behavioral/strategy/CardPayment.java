package com.design.LLD.lldPractice.behavioral.strategy;

public class CardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " by card");
    }
}

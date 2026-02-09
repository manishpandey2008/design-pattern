package com.design.LLD.lldPractice.behavioral.strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.add(100);
        cart.setPaymentStrategy(new UPIPayment());
        cart.checkout();
    }
}

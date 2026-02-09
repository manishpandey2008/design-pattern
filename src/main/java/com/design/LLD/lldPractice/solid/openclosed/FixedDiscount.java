package com.design.LLD.lldPractice.solid.openclosed;

public class FixedDiscount implements DiscountCalculator {
    private final double amount;

    public FixedDiscount(double amount) {
        this.amount = amount;
    }

    @Override
    public double apply(double price) {
        return Math.max(0, price - amount);
    }
}

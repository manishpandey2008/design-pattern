package com.design.LLD.lldPractice.solid.openclosed;

public class PercentageDiscount implements DiscountCalculator {
    private final int percent;

    public PercentageDiscount(int percent) {
        this.percent = percent;
    }

    @Override
    public double apply(double price) {
        return price * (1 - percent / 100.0);
    }
}

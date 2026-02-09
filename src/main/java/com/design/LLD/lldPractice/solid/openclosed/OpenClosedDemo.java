package com.design.LLD.lldPractice.solid.openclosed;

public class OpenClosedDemo {
    public static void main(String[] args) {
        double price = 100.0;
        DiscountCalculator tenPercent = new PercentageDiscount(10);
        DiscountCalculator fiveOff = new FixedDiscount(5);
        System.out.println("After 10%: " + tenPercent.apply(price));
        System.out.println("After 5 off: " + fiveOff.apply(price));
    }
}

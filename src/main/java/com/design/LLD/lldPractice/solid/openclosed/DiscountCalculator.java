package com.design.LLD.lldPractice.solid.openclosed;

// Open for extension (new discount types), closed for modification of this interface.
public interface DiscountCalculator {
    double apply(double price);
}

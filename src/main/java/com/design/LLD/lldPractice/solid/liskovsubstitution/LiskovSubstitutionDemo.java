package com.design.LLD.lldPractice.solid.liskovsubstitution;

public class LiskovSubstitutionDemo {
    public static void main(String[] args) {
        Shape rect = new Rectangle(4, 5);
        Shape square = new Square(4);
        System.out.println("Rectangle area: " + rect.area());
        System.out.println("Square area: " + square.area());
    }
}

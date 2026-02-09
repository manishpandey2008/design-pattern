package com.design.LLD.lldPractice.solid.liskovsubstitution;

// Subtype that can replace Rectangle wherever Shape is expected — area() still makes sense.
public class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int area() {
        return side * side;
    }
}

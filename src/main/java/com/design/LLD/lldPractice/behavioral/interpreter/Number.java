package com.design.LLD.lldPractice.behavioral.interpreter;

public class Number implements Expression {
    private final int value;

    public Number(int value) {
        this.value = value;
    }

    @Override
    public int interpret() {
        return value;
    }
}

package com.design.LLD.lldPractice.behavioral.interpreter;

public class InterpreterDemo {
    public static void main(String[] args) {
        Expression expr = new Add(new Number(1), new Number(2));
        System.out.println(expr.interpret());
    }
}

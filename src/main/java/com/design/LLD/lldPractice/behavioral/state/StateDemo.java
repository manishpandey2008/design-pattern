package com.design.LLD.lldPractice.behavioral.state;

public class StateDemo {
    public static void main(String[] args) {
        Context ctx = new Context(new StateA());
        ctx.request();
        ctx.request();
    }
}

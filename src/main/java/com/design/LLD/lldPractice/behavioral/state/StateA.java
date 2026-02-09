package com.design.LLD.lldPractice.behavioral.state;

public class StateA implements State {
    @Override
    public void handle(Context ctx) {
        System.out.println("State A");
        ctx.setState(new StateB());
    }
}

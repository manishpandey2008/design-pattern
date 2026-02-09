package com.design.LLD.lldPractice.behavioral.state;

public class StateB implements State {
    @Override
    public void handle(Context ctx) {
        System.out.println("State B");
    }
}

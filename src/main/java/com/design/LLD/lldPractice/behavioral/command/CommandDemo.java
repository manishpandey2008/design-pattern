package com.design.LLD.lldPractice.behavioral.command;

public class CommandDemo {
    public static void main(String[] args) {
        Light light = new Light();
        Invoker invoker = new Invoker();
        invoker.setCommand(new LightOnCommand(light));
        invoker.press();
    }
}

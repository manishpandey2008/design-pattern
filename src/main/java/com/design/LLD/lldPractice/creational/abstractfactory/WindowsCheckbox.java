package com.design.LLD.lldPractice.creational.abstractfactory;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void check() {
        System.out.println("Windows checkbox checked");
    }
}

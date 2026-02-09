package com.design.LLD.lldPractice.creational.abstractfactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        GUIFactory factory = System.getProperty("os.name").toLowerCase().contains("mac")
                ? new MacFactory() : new WindowsFactory();
        Button btn = factory.createButton();
        Checkbox cb = factory.createCheckbox();
        btn.render();
        cb.check();
    }
}

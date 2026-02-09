package com.design.LLD.lldPractice.creational.abstractfactory;

// One factory gives you a whole family of related widgets (button + checkbox that match).
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

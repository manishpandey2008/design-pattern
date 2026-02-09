package com.design.LLD.lldPractice.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private final List<Observer> observers = new ArrayList<>();
    private int state;

    public void attach(Observer o) {
        observers.add(o);
    }

    public void setState(int state) {
        this.state = state;
        for (Observer o : observers) o.update(state);
    }

    public int getState() {
        return state;
    }
}

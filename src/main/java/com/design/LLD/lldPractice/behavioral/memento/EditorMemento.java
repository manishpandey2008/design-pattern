package com.design.LLD.lldPractice.behavioral.memento;

public class EditorMemento {
    private final String text;

    EditorMemento(String text) {
        this.text = text;
    }

    String getText() {
        return text;
    }
}

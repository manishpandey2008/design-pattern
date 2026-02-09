package com.design.LLD.lldPractice.behavioral.memento;

// Snapshot of state. Only the originator should read/write it.
public class EditorMemento {
    private final String text;

    EditorMemento(String text) {
        this.text = text;
    }

    String getText() {
        return text;
    }
}

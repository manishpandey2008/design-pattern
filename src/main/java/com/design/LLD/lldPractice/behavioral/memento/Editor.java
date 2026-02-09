package com.design.LLD.lldPractice.behavioral.memento;

// Originator: creates mementos and can restore from them. Undo = restore previous state.
public class Editor {
    private String text = "";

    public void type(String s) {
        text += s;
    }

    public EditorMemento save() {
        return new EditorMemento(text);
    }

    public void restore(EditorMemento m) {
        this.text = m.getText();
    }

    public String getText() { return text; }
}

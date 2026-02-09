package com.design.LLD.lldPractice.behavioral.memento;

public class MementoDemo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.type("Hello");
        EditorMemento saved = editor.save();
        editor.type(" World");
        System.out.println(editor.getText());
        editor.restore(saved);
        System.out.println(editor.getText());
    }
}

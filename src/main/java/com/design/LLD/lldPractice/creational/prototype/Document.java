package com.design.LLD.lldPractice.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Document implements Cloneable {
    private String title;
    private List<String> lines = new ArrayList<>();

    public Document(String title) {
        this.title = title;
    }

    public void addLine(String line) {
        lines.add(line);
    }

    // Uses Object.clone() under the hood; we override to do a proper deep copy of the list.
    @Override
    public Document clone() {
        try {
            Document copy = (Document) super.clone();
            copy.lines = new ArrayList<>(this.lines);
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public void setTitle(String title) { this.title = title; }
    public String getTitle() { return title; }
    public List<String> getLines() { return lines; }
}

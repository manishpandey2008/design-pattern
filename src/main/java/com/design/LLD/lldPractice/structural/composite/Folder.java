package com.design.LLD.lldPractice.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemNode {
    private final String name;
    private final List<FileSystemNode> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystemNode node) {
        children.add(node);
    }

    @Override
    public String getName() { return name; }

    @Override
    public int getSize() {
        return children.stream().mapToInt(FileSystemNode::getSize).sum();
    }
}

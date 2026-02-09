package com.design.LLD.lldPractice.structural.composite;

// Same interface for leaf (file) and container (folder). Client treats them uniformly.
public interface FileSystemNode {
    String getName();
    int getSize();
}

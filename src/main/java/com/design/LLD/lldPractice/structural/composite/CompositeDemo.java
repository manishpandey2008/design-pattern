package com.design.LLD.lldPractice.structural.composite;

public class CompositeDemo {
    public static void main(String[] args) {
        Folder root = new Folder("root");
        root.add(new File("a.txt", 100));
        Folder sub = new Folder("sub");
        sub.add(new File("b.txt", 200));
        root.add(sub);
        System.out.println(root.getSize());
    }
}

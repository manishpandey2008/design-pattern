package com.design.LLD.lldPractice.creational.prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        Document original = new Document("Report");
        original.addLine("Line 1");
        original.addLine("Line 2");
        Document copy = original.clone();
        copy.setTitle("Report - Copy");
        copy.addLine("Line 3");
        System.out.println(original.getTitle() + " lines: " + original.getLines().size());
        System.out.println(copy.getTitle() + " lines: " + copy.getLines().size());
    }
}

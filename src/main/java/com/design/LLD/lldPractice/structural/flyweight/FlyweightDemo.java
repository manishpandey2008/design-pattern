package com.design.LLD.lldPractice.structural.flyweight;

public class FlyweightDemo {
    public static void main(String[] args) {
        TreeType oak = TreeFactory.getTreeType("Oak", "green");
        Tree t1 = new Tree(10, 20, oak);
        Tree t2 = new Tree(30, 40, oak);
        t1.draw();
        t2.draw();
    }
}

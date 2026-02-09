package com.design.LLD.lldPractice.solid.interfacesegregation;

public class InterfaceSegregationDemo {
    public static void main(String[] args) {
        Printer p = new SimplePrinter();
        p.print("Hello");
        MultiFunctionDevice mfd = new MultiFunctionDevice();
        mfd.print("Doc");
        System.out.println(mfd.scan());
    }
}

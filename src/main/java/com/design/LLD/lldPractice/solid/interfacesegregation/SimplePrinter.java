package com.design.LLD.lldPractice.solid.interfacesegregation;

public class SimplePrinter implements Printer {
    @Override
    public void print(String doc) {
        System.out.println("Printing: " + doc);
    }
}

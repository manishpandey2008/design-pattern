package com.design.LLD.lldPractice.solid.interfacesegregation;

public class MultiFunctionDevice implements Printer, Scanner {
    @Override
    public void print(String doc) {
        System.out.println("Printing: " + doc);
    }

    @Override
    public String scan() {
        return "Scanned content";
    }
}

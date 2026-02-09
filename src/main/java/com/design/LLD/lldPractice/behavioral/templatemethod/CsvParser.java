package com.design.LLD.lldPractice.behavioral.templatemethod;

public class CsvParser extends DataParser {
    @Override
    protected void read() {
        System.out.println("Reading CSV");
    }
    @Override
    protected void process() {
        System.out.println("Processing CSV");
    }
    @Override
    protected void write() {
        System.out.println("Writing result");
    }
}

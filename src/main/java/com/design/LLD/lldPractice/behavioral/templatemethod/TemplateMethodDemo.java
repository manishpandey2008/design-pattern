package com.design.LLD.lldPractice.behavioral.templatemethod;

public class TemplateMethodDemo {
    public static void main(String[] args) {
        DataParser parser = new CsvParser();
        parser.parse();
    }
}

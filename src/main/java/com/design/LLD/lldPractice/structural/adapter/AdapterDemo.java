package com.design.LLD.lldPractice.structural.adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        JsonParser parser = new XmlToJsonAdapter(new LegacyXmlWriter());
        System.out.println(parser.toJson("hello"));
    }
}

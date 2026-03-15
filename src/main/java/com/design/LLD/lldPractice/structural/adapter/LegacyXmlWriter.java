package com.design.LLD.lldPractice.structural.adapter;

public class LegacyXmlWriter {
    public String toXml(Object obj) {
        return "<root><value>" + obj.toString() + "</value></root>";
    }
}

package com.design.LLD.lldPractice.structural.adapter;

// Imagine this is a third-party class we can't change. It only outputs XML.
public class LegacyXmlWriter {
    public String toXml(Object obj) {
        return "<root><value>" + obj.toString() + "</value></root>";
    }
}

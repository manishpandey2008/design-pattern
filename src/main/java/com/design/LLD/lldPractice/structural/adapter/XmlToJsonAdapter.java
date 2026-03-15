package com.design.LLD.lldPractice.structural.adapter;

public class XmlToJsonAdapter implements JsonParser {
    private final LegacyXmlWriter legacy;

    public XmlToJsonAdapter(LegacyXmlWriter legacy) {
        this.legacy = legacy;
    }

    @Override
    public String toJson(Object obj) {
        String xml = legacy.toXml(obj);
        return "{\"content\": \"" + xml.replace("\"", "\\\"") + "\"}";
    }
}

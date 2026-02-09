package com.design.LLD.lldPractice.structural.adapter;

// Wraps the legacy writer and makes it look like a JsonParser. Client stays unchanged.
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

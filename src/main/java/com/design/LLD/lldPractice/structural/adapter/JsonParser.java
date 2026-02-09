package com.design.LLD.lldPractice.structural.adapter;

// Our code expects this. The legacy lib speaks something else — adapter translates.
public interface JsonParser {
    String toJson(Object obj);
}

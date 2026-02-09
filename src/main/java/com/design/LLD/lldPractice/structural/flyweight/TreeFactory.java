package com.design.LLD.lldPractice.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static final Map<String, TreeType> cache = new HashMap<>();

    public static TreeType getTreeType(String name, String color) {
        String key = name + "-" + color;
        return cache.computeIfAbsent(key, k -> new TreeType(name, color));
    }
}

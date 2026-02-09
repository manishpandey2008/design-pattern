package com.design.LLD.lldPractice.behavioral.iterator;

import java.util.Iterator;

public class MyList implements Iterable<String> {
    private final String[] items;

    public MyList(String... items) {
        this.items = items;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int i = 0;
            @Override
            public boolean hasNext() { return i < items.length; }
            @Override
            public String next() { return items[i++]; }
        };
    }
}

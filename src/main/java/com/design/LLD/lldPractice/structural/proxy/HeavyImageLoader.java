package com.design.LLD.lldPractice.structural.proxy;

// Expensive to create. Proxy defers or caches access.
public class HeavyImageLoader implements ImageLoader {
    private final String path;

    public HeavyImageLoader(String path) {
        this.path = path;
        System.out.println("Heavy load: " + path);
    }

    @Override
    public void load(String path) {
        System.out.println("Displaying " + path);
    }
}

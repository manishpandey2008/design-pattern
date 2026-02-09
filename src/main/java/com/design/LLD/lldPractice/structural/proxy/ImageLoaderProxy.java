package com.design.LLD.lldPractice.structural.proxy;

// Uses composition: holds the real loader, creates it only when needed.
public class ImageLoaderProxy implements ImageLoader {
    private final String path;
    private HeavyImageLoader real;

    public ImageLoaderProxy(String path) {
        this.path = path;
    }

    @Override
    public void load(String path) {
        if (real == null) {
            real = new HeavyImageLoader(path);
        }
        real.load(path);
    }
}

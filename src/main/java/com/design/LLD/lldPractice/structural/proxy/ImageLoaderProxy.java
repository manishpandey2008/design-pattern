package com.design.LLD.lldPractice.structural.proxy;

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

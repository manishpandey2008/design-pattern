package com.design.LLD.lldPractice.structural.proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        ImageLoader proxy = new ImageLoaderProxy("photo.jpg");
        proxy.load("photo.jpg");
        proxy.load("photo.jpg");
    }
}

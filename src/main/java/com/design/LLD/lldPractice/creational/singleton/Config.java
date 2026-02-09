package com.design.LLD.lldPractice.creational.singleton;

// One instance for the whole app. Lazy holder is thread-safe and avoids sync overhead.
public class Config {
    private final String env;

    private Config() {
        this.env = System.getProperty("env", "dev");
    }

    private static class Holder {
        static final Config INSTANCE = new Config();
    }

    public static Config getInstance() {
        return Holder.INSTANCE;
    }

    public String getEnv() {
        return env;
    }
}

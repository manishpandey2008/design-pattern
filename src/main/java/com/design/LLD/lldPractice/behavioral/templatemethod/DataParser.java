package com.design.LLD.lldPractice.behavioral.templatemethod;

// Skeleton is fixed; subclasses fill in the steps. Same flow, different details.
public abstract class DataParser {
    public final void parse() {
        read();
        process();
        write();
    }

    protected abstract void read();
    protected abstract void process();
    protected abstract void write();
}

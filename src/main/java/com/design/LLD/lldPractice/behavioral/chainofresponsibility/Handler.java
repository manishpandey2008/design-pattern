package com.design.LLD.lldPractice.behavioral.chainofresponsibility;

public abstract class Handler {
    protected Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public void handle(int amount) {
        if (canHandle(amount)) {
            doHandle(amount);
        } else if (next != null) {
            next.handle(amount);
        }
    }

    protected abstract boolean canHandle(int amount);
    protected abstract void doHandle(int amount);
}

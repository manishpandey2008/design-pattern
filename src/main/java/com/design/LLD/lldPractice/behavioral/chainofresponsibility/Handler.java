package com.design.LLD.lldPractice.behavioral.chainofresponsibility;

// Each handler can pass the request along. Stops when someone handles it.
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

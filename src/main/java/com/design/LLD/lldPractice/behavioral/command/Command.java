package com.design.LLD.lldPractice.behavioral.command;

// Encapsulate an action. Can queue it, undo it, or run it later.
public interface Command {
    void execute();
}

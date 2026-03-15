package com.pattern;

interface Notification{
    void sendMessage(String message);
}

class EmilNotification implements  Notification{
    @Override
    public void sendMessage(String message) {
        System.out.println("Email Notification : "+ message);
    }
}

class TextNotification implements Notification{
    @Override
    public void sendMessage(String message) {
        System.out.println("Text Notification : "+ message);
    }
}

class CarFactory{
    public Notification getNotification(String name){
        if (name.equals("email")) {
            return new EmilNotification();
        }
        return new TextNotification();
    }
}

public class FactoryPatterTest {
    public static void main(String[] args) {

    }
}

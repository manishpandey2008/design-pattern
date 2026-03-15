package com.custumException;

public class UserNotFoundException extends Exception{

    UserNotFoundException(String message, Throwable throwable){
        super(message,throwable);
    }

    UserNotFoundException(String message){
        super(message);
    }

}

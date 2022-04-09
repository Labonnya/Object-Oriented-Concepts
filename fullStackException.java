package com.company;

public class fullStackException extends RuntimeException {
    public fullStackException() {
        this("Stack is full");
    }

    public fullStackException(String exception) {
        super(exception);
    }

}
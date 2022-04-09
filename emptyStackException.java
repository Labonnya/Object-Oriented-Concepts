package com.company;

public class emptyStackException extends RuntimeException {
    public emptyStackException(){
        this("Stack is empty");
    }
    public emptyStackException(String exception){
        super(exception);
    }
}


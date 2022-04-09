package com.company;

public class Stack <E>{
    public int size;
    public int top;
    public E element[];

    public Stack(){
        this(10); //default stack size
    }

    public Stack(int s){
           size = s>0 ? s: 10; //set stack size
           top = -1;
           element= (E[])new Object [size]; //setting array size
    }
    public void push(E pushValue) {
        if (top == size - 1) {
            throw new fullStackException(String.format("Stack is full, can't push %s" + pushValue));
        } else {
            element[++top] = pushValue;
        }
    }

    public void pop(){
        if(top==-1){
            throw new emptyStackException("Stack is empty, can't pop anymore element.");
        }
        else
        {
            System.out.println(element[top]);
            top--;
        }
    }
    }


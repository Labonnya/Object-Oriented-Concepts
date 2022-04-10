package com.company;

public class arrayWriter implements Runnable{
    private simpleArray sharedSimpleArray;
    private int startValue;

    public arrayWriter(int value, simpleArray array){
        this.startValue=value;
        this.sharedSimpleArray=array;
    }

    @Override
    public void run() {
        for(int i=startValue;i<startValue+3;i++){
            sharedSimpleArray.add(i);
        }
    }
}
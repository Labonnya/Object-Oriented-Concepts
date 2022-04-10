package com.company;

import java.util.Random;

public class printTask implements Runnable{

    private final int sleepTime;
    private final String taskName;
    private final Random generator = new Random();

    public printTask(String name){
        taskName=name;
        sleepTime= generator.nextInt(500);
    }
    @Override
    public void run() {
          try{
              System.out.printf("\n%s is going to sleep for %d milliseconds.",taskName,sleepTime);
              Thread.sleep(sleepTime);
          }
          catch(Exception e){
              System.out.println("%s terminated for exception.."+taskName);
          }
        System.out.printf("\n%s done sleeping..",taskName);
    }
}

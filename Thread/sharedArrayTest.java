package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class sharedArrayTest{
    public static void main(String[] args) {
        simpleArray sharedSimpleArray = new simpleArray(6);
        arrayWriter aw1 = new arrayWriter(1,sharedSimpleArray);
        arrayWriter aw2 = new arrayWriter(11,sharedSimpleArray);

        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.execute(aw1);
        executorService.execute(aw2);

        executorService.shutdown();

        try{
            boolean taskEnded = executorService.awaitTermination(1, TimeUnit.MINUTES);
            if(taskEnded){
                System.out.println(sharedSimpleArray);
            }
            else{
                System.out.println("Timed out..");
            }
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }

}



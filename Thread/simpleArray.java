package com.company;

import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class simpleArray {
    private int[] array;
    private int index = 0;
    private Random generator = new Random();

    public simpleArray(int size) {
        array = new int[size];
    }

    public synchronized void add(int value) {

        try {
            Thread.sleep(generator.nextInt(500));
        } catch (Exception e) {
            e.printStackTrace();
        }

        int position = index;
        array[position] = value;

        System.out.printf("\n%s wrote %d to element %d", Thread.currentThread().getName(), value, position);

        ++index;

        System.out.printf("\nNext write index %d", index);
        System.out.println();
    }


}
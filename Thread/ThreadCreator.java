package com.company;

import java.lang.Thread;

public class ThreadCreator {
    public static void main(String[] args) {

        System.out.println("Creating threads...");

        Thread thread1 = new Thread(new printTask("Task 1"));
        Thread thread2 = new Thread(new printTask("Task 2"));
        Thread thread3 = new Thread(new printTask("Task 3"));

        System.out.println("Thread created successfully...");

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("Task started...");

    }

}

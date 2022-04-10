package com.company;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class TaskExecutor {
    public static void main(String[] args) {

        printTask task1 = new printTask("Task 1");
        printTask task2 = new printTask("Task 2");
        printTask task3 = new printTask("Task 3");

        System.out.println("Starting executors...");

        ExecutorService executor = Executors.newCachedThreadPool();

        executor.execute(task1);
        executor.execute(task2);
        executor.execute(task3);

        executor.shutdown();

        System.out.println("\nTask started, main ends..");

    }
}

package com.company;
import java.util.Stack;

public class stackTree {
    Stack<Number> stack = new Stack<Number>();

    public stackTree() {
        Float f = 1.0F;
        Double d = 2.99999;
        Integer i = 10;
        Long longNumber = 12L;

        stack.push(f);
        printStack(stack);
        stack.push(d);
        printStack(stack);
        stack.push(i);
        printStack(stack);
        stack.push(longNumber);
        printStack(stack);
        Number n = null;
        while (true) {
            n = stack.pop();
            System.out.println("\nStack after popping: ");
            printStack(stack);
        }
    }

    public void printStack(Stack<Number> stack) {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("\nStack contains: ");
            for (Number n : stack) {
                System.out.print(" " + n);
            }
        }

    }
}

package com.company;

public class stackTest2 {

    Integer[] intArray = {1, 2, 3, 4, 5};
    Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};

    Stack<Integer> integerStack = new Stack<>(5);
    Stack<Double> doubleStack = new Stack<>(4);

    public void testStacks(){
        push(integerStack,intArray);
        pop(integerStack,intArray);
        push(doubleStack,doubleArray);
        pop(doubleStack,doubleArray);
    }
    public <T> void push(Stack<T> stack, T[] array) {
        try {
            System.out.println("\nPushing elements into stack: ");
            for (T elements : array) {
                stack.push(elements);
                System.out.print(" " + elements);
            }
        } catch (fullStackException fullStackException) {
            fullStackException.printStackTrace();
        }
    }

    public <T> void pop(Stack<T> stack, T[] array) {
        try {
            T value;
            System.out.println("\nPopping elements from stack: ");
            while (true) {
                value = stack.pop();
                System.out.print(" " + value);
            }
        } catch (emptyStackException emptyStackException) {
            emptyStackException.printStackTrace();
        }
    }

    public static void main(String[] args) {
        stackTest2 st1 = new stackTest2();
        st1.testStacks();

    }
}

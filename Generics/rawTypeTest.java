package com.company;

public class rawTypeTest {

    Integer [] intArray = {1,23,32};
    Double [] doubleArray = {1.1,2.2,3.3};

    Stack rawTypeStack = new Stack(2);
    Stack rawTypeStack2 = new Stack(3);

    public void stackTest(){
        push(rawTypeStack,intArray);
        pop(rawTypeStack,intArray);
        push(rawTypeStack2,doubleArray);
        pop(rawTypeStack2,doubleArray);
    }

    public <T> void push(Stack <T> stack, T [] array){
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

    public <T> void pop (Stack <T> stack, T [] array){
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
        rawTypeTest rt = new rawTypeTest();
        rt.stackTest();
    }
}

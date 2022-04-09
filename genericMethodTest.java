package com.company;

public class genericMethodTest {
    public static void main(String[] args) {

        Integer [] intArray = {1,2,3,4,5};
        Double [] doubleArray = {1.1,2.2,3.3,4.4,5.5};
        Character [] charArray = {'a','b','c','d','e'};

        System.out.println("Integer array contains: ");
        printArray(intArray);
        System.out.println("Double array contains: ");
        printArray(doubleArray);
        System.out.println("Character array contains: ");
        printArray(charArray);
    }
    public static <E> void printArray(E[] inputArray) {
                for(E element : inputArray)
                {
                    System.out.print(" "+element);
                }
        System.out.println();
    }
}

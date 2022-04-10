package com.company;


public class stackTest {

    Integer [] intArray = {1,2,3,4,5,6,7,8,9,10};
    Double [] doubleArray = {1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9};

    Stack<Integer> integerStack = new Stack<>(10);
    Stack<Double> doubleStack = new Stack<>(5);

    public void testStack() {
        pushDouble();
        popDouble();
        pushInteger();
        popInteger();

    }


    public void pushInteger(){
        try{
            System.out.println("Pushing elements into integer stack: ");
            for(int element : intArray){
                System.out.print(" "+element);
                integerStack.push(element);
            }
        }
        catch(fullStackException fullStackException){
            System.out.println();
            fullStackException.printStackTrace();
        }
    }

    public void popInteger(){
        try{
            System.out.println("\nPopping elements from integer stack");
            int value;
            while(true) {
                for (int element : intArray) {
                    value = integerStack.pop();
                    System.out.print(" " + value);
                }
            }
        }
        catch(emptyStackException emptyStackException){
            System.out.println();
            emptyStackException.printStackTrace();
        }
    }

    public  void pushDouble(){
        try{
            System.out.println("\nPushing double values to stack: ");
            for(double element: doubleArray)
            {
                doubleStack.push(element);
                System.out.print(" "+ element);
            }
        }
        catch(fullStackException FullStackException){
            System.out.println();
            FullStackException.printStackTrace();
        }
    }

    public void popDouble(){
        try{
            System.out.println("\nPopping elements from double stack: ");
            double value;
            while(true){
                value=doubleStack.pop();
                System.out.print(" "+value);
            }
        }
        catch(emptyStackException emptyStackException){
            System.out.println();
            emptyStackException.printStackTrace();
        }
    }

    public static void main(String[] args) {
        stackTest st = new stackTest();
        st.testStack();
    }

}

package com.company;

public class genericsClass<E1,E2> {
    public void display(E1 name, E2 age){

        System.out.println("Name: "+name+"\n"+ "Age: "+age);
    }
    public static void main(String[] args) {
           genericsClass<String,Integer> person1 =new genericsClass<>();
           person1.display("Anika",18);
    }
}

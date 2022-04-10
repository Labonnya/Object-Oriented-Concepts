package com.company;
import java.util.*;
public class manyFunc {
    private String[] card ={"Diamond","Heart","Spade","Clubs"};
    public void print(){
    List <String> list = Arrays.asList(card);
        System.out.println("Unsorted array elements: ");
        System.out.print(" " +list);
        Collections.sort(list);
        System.out.println("\nSorted array elements: ");
        System.out.print(" "+list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("\nSorted elements in reverse order: ");
        System.out.print(" "+list);

    }
}

package com.company;
import java.util.*;

public class linkedList {
    private String color1[] = {"Red", "Blue", "Green", "Black", "White", "Pink"};
    private String color2[] = {"Blue", "Orange", "Green", "Violet"};

    List<String> list1 = new LinkedList<String>();
    List<String> list2 = new LinkedList<String>();

    public linkedList() {
        for (String s : color1)
        {
            list1.add(s);
        }
        for (String s : color2)
        {
            list2.add(s);
        }

        list1.addAll(list2);
        list2=null;
        System.out.println("List after adding both lists: ");
        printList(list1);

        convertToUpperCaseStrings(list1);
        System.out.println("\nList after UPPERCASE: ");
        printList(list1);
        System.out.println("\nList after removing: ");
        removeItems(list1);
        printList(list1);
        System.out.println("\nReversed list: ");
        printReversedList(list1);
    }
    public void printList(Collection<String>collection1){
        for(String s: collection1)
        {
            System.out.print(" "+s);
        }
    }

    public void convertToUpperCaseStrings(List <String> list){
        ListIterator <String> iterator = list.listIterator();
        while(iterator.hasNext()){
            String color = iterator.next();
            iterator.set(color.toUpperCase());
        }
    }
    public void removeItems(List<String>list1){
            list1.subList( 1, 4).clear();
        }

        public void printReversedList(List<String>list){
            ListIterator<String>iterator=list.listIterator(list.size());
            while(iterator.hasPrevious()){
                System.out.print(" "+iterator.previous());
            }
        }
    }


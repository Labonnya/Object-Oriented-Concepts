package com.company;

import java.util.*;

class arrays {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Mai");
        list.add("rita");
        list.add("Samu");
        System.out.println("List: " + list);
        list.remove("Mai");
        System.out.println("List after removing: " + list);
        String element = list.get(1);
        System.out.println("Element at pos 2: " + element);
        list.set(1, "Priya");
        System.out.println("Element after updating: " + list);
        //list.clear();
        //System.out.println(list);
        LinkedList<String> list2 = new LinkedList<String>();
        list2.add("maa");
        list.addAll(list2);
        System.out.println("List : " + list);
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String color = iterator.next();
            iterator.set(color.toUpperCase());
        }
        System.out.println(list);

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(5);
        linkedList.add(15);
        linkedList.add(35);
        linkedList.add(65);
        linkedList.add(25);
        System.out.println(linkedList);
        Collections.sort(linkedList);
        System.out.println(linkedList);
        Collections.shuffle(linkedList);
        System.out.println(linkedList);
        int min = Collections.min(linkedList);
        System.out.println(min);
        int max=Collections.max(linkedList);
        System.out.println(max);
        int freq=Collections.frequency(linkedList,25);
        System.out.println(freq);
        Collections.reverse(linkedList);
        System.out.println(linkedList);
        Collections.replaceAll(linkedList,25,64);
        System.out.println(linkedList);
        int location = Collections.binarySearch(linkedList,5);
        if(location>=0){
            System.out.println("Item found at pos: "+location);
        }
        else{
            System.out.println("Item not found");
        }
        Collections.fill(linkedList,7);
        System.out.println(linkedList);

        Stack<Number> stack = new Stack<Number>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        Number removedObject = null;
        while(true){
            removedObject= stack.pop();
            System.out.println("Stack after popping "+removedObject+" "+stack);
        }

    }
}
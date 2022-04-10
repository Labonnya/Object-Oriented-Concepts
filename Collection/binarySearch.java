package com.company;
import java.util.*;

public class binarySearch {
    private String arr [] = {"Black","Green","Red","Blue","Yellow"};
    List <String> list = Arrays.asList(arr);
    public void search() {
        Collections.sort(list);
        System.out.println("Array after sorting: ");
        for( String s : list){
            System.out.print(" "+s);
        }
       // binary("black");

    }
    public void binary(String s){
        int location = Collections.binarySearch(list,s);
        if(location>=0){
            System.out.println("Black is found at index "+location);
        }
        else{
            System.out.println("Black is not in array list.");
        }
    }



}

package com.company;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class arrList {
    private static final String colours[] = {"RED", "BLUE", "GREEN", "WHITE", "YELLOW", "PINK"};
    private static final String removeColours[] = {"RED", "WHITE", "YELLOW"};

    public arrList() {
        List<String> list = new ArrayList<String>();
        List<String> removeList = new ArrayList<String>();

        for (String c : colours) {
            list.add(c);
        }
        for (String rc : removeColours){
            removeList.add(rc);
        }
        System.out.println("Array list before removing colours: ");
        for(int i=0;i<list.size();i++)
        {
            System.out.print(" "+list.get(i));
        }
        removeColor(list,removeList);
        System.out.println("\nArray list after removing colours: ");
        for(String s : list){
            System.out.print(" "+s);
        }
    }
    public void removeColor(Collection <String> collection1, Collection <String> collection2){
             Iterator <String> iterator = collection1.iterator();
             while(iterator.hasNext()){
                 if(collection2.contains(iterator.next())){
                     iterator.remove();
                 }
             }

    }
}
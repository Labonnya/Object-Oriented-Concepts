package com.company;
import java.util.*;
public class sort {
    public static void main(String[] args) {

        List<User>list=new ArrayList<User>();
        User user1 = new User("John",22112);
        User user2 = new User("Mitali",78278);
        User user3 = new User("Labonnya",27837);
        User user4 = new User("tash",1378);

        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        for(User user:list){
            System.out.println(user);
        }

        Collections.sort(list,new timeCompare());
        System.out.println("After sorting:");
        for(User user:list){
            System.out.println(user);
        }

    }

}

package com.company;

import java.sql.Time;
import java.util.Comparator;

public class timeCompare implements Comparator<User> {
    @Override
public int compare(User user1,User user2){
                  return user1.id-user2.id;
        }

}

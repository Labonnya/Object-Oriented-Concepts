package com.company;

public class User {
    String name;
    int id;
    public User(String name,int id){
        this.name=name;
        this.id=id;
    }
    public String toString(){
        return id+":"+name;
    }
}

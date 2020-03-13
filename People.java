package com.company;

public class People {
    People(String id){
        this.name = id;
        if (id.indexOf(",") > 0){
            this.weight = 2;
        }
        else{
            this.weight = 1;
        }
    }
    String name;
    int weight;
    boolean free = true;
}

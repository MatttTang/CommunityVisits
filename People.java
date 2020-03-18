package com.company;

public class People {
    // Constructor, given person's name
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
    // Availability
    boolean free = true;
}

package com.company;

public class Group {
    int perG;
    int currWeight = 0;
    String occupants = "";
    // Constructor for group, given group size
    Group(int num){
        this.perG = num;
    }
    // Adds person into group
    void Add(People id){
        this.occupants = this.occupants + " " + id.name;
        this.currWeight = this.currWeight + id.weight;
    }

    // Check if addition of person is valid
    boolean Check(People id){
        if (this.currWeight + id.weight > this.perG){
            return false;
        }
        return true;
    }

    // Check if current group is full
    boolean isFull(){
        if (this.currWeight == perG){
            return true;
        }
        return false;
    }
}

package com.company;

public class Group {
    int perG;
    int currWeight = 0;
    String occupants = "";
    Group(int num){
        this.perG = num;
    }
    void Add(People id){
        this.occupants = this.occupants + ", " + id.name;
        this.currWeight = this.currWeight + id.weight;
    }
    void Clear(){
        this.occupants = "";
        this.currWeight = 0;
    }
    boolean Check(People id){
        if (this.currWeight + id.weight > this.perG){
            return false;
        }
        return true;
    }
    boolean isFull(){
        if (this.currWeight == perG){
            return true;
        }
        return false;
    }
}

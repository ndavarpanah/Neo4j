package com.designpattern.www;

public class Programmer extends Employee {
    public Programmer() {
        position = "Senior";
    }

    @Override
    void work() {
        System.out.println("Writing Code!");
    }

}



package com.designpattern.www;

public class Janitor extends Employee {
    public Janitor() {
        position = "Part-Time";
    }

    @Override
    void work() {
        System.out.println("Cleaning Hallway!");
    }

}

package com.designpattern.www;

public class Manager extends Employee {
    public Manager() {
        position = "Intern";
    }

    @Override
    void work() {
        System.out.println("Creating Schedule!");
    }

}
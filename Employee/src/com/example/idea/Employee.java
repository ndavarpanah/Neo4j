package com.example.idea;
import  java.io.*;

public class Employee {

    String name;
    int age;
    String designation;
    double salary;

    //
    public Employee(String name){
        this.name = name;
    }


    //SETTERS
    public void setAgeEmployee(int age){
        this.age = age;
    }


    public void setDesignationEmployee(String designation){
        this.designation = designation;
    }

    public void setSalaryEmployee(double salary){
        this.salary = salary;
    }


    public void printEmployee(){
        System.out.println("Name: "+ name );
        System.out.println("Age:" + age );
        System.out.println("Designation:" + designation );
        System.out.println("Salary:" + salary);
    }


}

package com.example.idea;

public class EmployeeTest {
    public static void main(String args[]){
        Employee one = new Employee("James Smith");
        Employee two = new Employee("Mary Anne");

        one.setAgeEmployee(26);
        one.setDesignationEmployee("Senior Software Engineer");
        one.setSalaryEmployee(1000.0);

        one.printEmployee();

        two.setAgeEmployee(21);
        two.setDesignationEmployee("Software Engineer");
        two.setSalaryEmployee(500);

        two.printEmployee();
    }
}

package com.designpattern.www;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {


       /* ArrayList al = new ArrayList();

        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

        System.out.println("Original contents of al: ");
        Iterator itr = al.iterator();

        while (itr.hasNext()){
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();*/


        EmployeeHashTable.loadCache(); //static member function

        Employee clone1 = (Employee) EmployeeHashTable.getEmployee("ETPN1");
        Employee clone2 = (Employee) EmployeeHashTable.getEmployee("ETJN1");
        Employee clone3 = (Employee) EmployeeHashTable.getEmployee("ETMN1");

        System.out.println("Employee: " + clone1.getPosition() + "ID: " + clone1.getId());
        System.out.println("Employee: " + clone2.getPosition() + "ID: " + clone2.getId());
        System.out.println("Employee: " + clone3.getPosition() + "ID: " + clone3.getId());

    }
}

package com.vijayjiragal;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {
        // creating HashMap object for Employees

        HashMap<String, String > employee = new HashMap<>();

        //adding Keys and Values (Name, Address)
        employee.put("Vijay", "Columbus");
        employee.put("Vishal", "Chicago");
        employee.put("Sagar", "Texas");
        employee.put("Mahesh", "Atlanta");
        System.out.println(employee);

        //finding size of HashMap
        System.out.println("Size is = " + employee.size());

        //Accessing an item using get() method
        System.out.println(employee.get("Vishal"));
        System.out.println(employee.get("Vijay"));

        //Removing an item using remove() method
        employee.remove("Mahesh");
        System.out.println(employee);

        //looping through HashMap using keyset() and values() methods
        //Printing all the keys
        for(String i : employee.keySet()){
            System.out.println(i);
        }

        //printing all the values
        for(String i : employee.values()){
            System.out.println(i);
        }

        //printing both Keyset and values
        for(String i : employee.keySet()){
            System.out.println("Key: " + i + " | Values: " + employee.get(i));
        }

        //clearing all items from HashMap
        employee.clear();
        System.out.println(employee); // Prints empty list

        //HashMap to store Strings and Integers
        HashMap<Integer, String> newStudent = new HashMap<>();
        newStudent.put(101, "Vijay");
        newStudent.put(102, "Vishal");
        newStudent.put(103, "Mahesh");
        newStudent.put(104, "Sagar");
        System.out.println(newStudent);

        //Printing Key Value Pair using for-each loop
        for (int i : newStudent.keySet()){
            System.out.println("Key= " + i + " Value= "+newStudent.get(i));
        }

    }
}

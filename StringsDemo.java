package com.vijayjiragal;

import java.sql.SQLOutput;

public class StringsDemo {

    public static void main(String[] args) {

        String str = "HelloWorld";
        System.out.println(str);  // Printing String

        str = str.concat("Welcome2Java");  // String Concat

        System.out.println(str);  // concatenated string

        System.out.println(str.length());  //finding length of the string

        String s1 = "Columbus";
        String s2 = "columbux";
        String s0 = "";
        String s3 = "cOlUmBuS";
        System.out.println(s1.substring(2));            // Value from index 2 will be printed
        System.out.println(s1.compareTo(s2));           // comparing two strings--> Zero if equal else prints the difference.
        System.out.println(s0.isEmpty());               // Check if String is Empty  --> Prints boolean
        System.out.println(s2.toUpperCase());           // Prints string in Upper case
        System.out.println(s1.toLowerCase());           // Prints string in Upper case
        System.out.println(s1.compareToIgnoreCase(s3)); // compares ignoring cases.

        //Converting Data Types to String

        int a = 50;
        String s4 = String.valueOf(a);
        System.out.println(s4);

        String s5 = "JavaBrains";
        System.out.println(s5.replace("s", "q"));                       //Replace Method

        String s6 = "Heldo";
        String replace = s6.replace('d', 'l');
        System.out.println(replace.contains("d"));                                       // Checks if cahracter is found

        String x= "Welcome to Java";
        String y= "wElCome to jAva";
        System.out.println("Are my strings Equal? Ans: " + x.equals(y));                 // Compares strings
        System.out.println("Are my strings Equal? Ans: " + x.equalsIgnoreCase(y));       // Compares strings

        System.out.println("Character at index 3 is = " + y.charAt(0));                 // Prints character at particular index in a string


    }
}

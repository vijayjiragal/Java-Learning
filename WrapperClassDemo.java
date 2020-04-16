package com.vijayjiragal;

import java.sql.SQLOutput;

public class WrapperClassDemo {

    public static void main(String[] args) {

        Integer myInt = 10;
        Double myDouble = 10.99;
        Character myChar = 'A';
        String myString = myInt.toString();

        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());
        System.out.println("lenght of our string is = " + myString.length());
    }
}

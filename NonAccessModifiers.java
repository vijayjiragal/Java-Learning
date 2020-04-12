package com.vijayjiragal;

public class NonAccessModifiers {

    /*
    static
    abstract
    final
    synchronize/volatile
    */
    final static Integer a = 10; // final value cannot be changed
    static Integer b= 20; // Not-final



    public static void main(String[] args) {

        //a = 10; // cannot assign value to final variable- Compiler Error
        b= 21;  //non-final variables can be changed.

    }
}

abstract class Shape{

    abstract float areaofSqaure();
}

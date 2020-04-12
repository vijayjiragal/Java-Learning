package com.vijayjiragal;

public class HelloWorld {

    //Static and Non-Static Methods

    public  static void  myStaticMethod () {
        System.out.println("This Output is from a static Method");
    }

    public void myNonStaticMethod(){
        System.out.println("This Output is from a Non-static Method");
    }


    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");

    //Calling static Method (no need to instantiate static methods)
        myStaticMethod();

    // Calling Non-Static Method (Object has to be created)

        HelloWorld hw = new HelloWorld();
        hw.myNonStaticMethod();
    }
}

package com.vijayjiragal;

//Creating Abstract Class
abstract class Person{

    public String firstName= "Vijay";
    public String  lastName = "Jiragal";
    public int age= 30;
    public abstract void myHobby();  // abstract method --> they will not have implementation
}

class Traveler extends Person {

    public int foundingYear= 2011;
    public void myHobby() {
        System.out.println(" Travel the World!");  // implementing abstract method
    }
}

public class AbstractDemo {

    public static void main(String[] args) {
        Traveler trv1 = new Traveler();
        trv1.myHobby();                            //Calling abstract method
    }
}

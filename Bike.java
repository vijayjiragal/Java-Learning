package com.vijayjiragal;

public class Bike extends Vehicle{
    Integer numberOfWheels;
    public void move(){
        System.out.println("Move in Bike Class");
    }

    public void printNoOfWheels(){
         numberOfWheels = 2;
        System.out.println("Number of Wheels for BiKe = " + numberOfWheels);
        System.out.println("Number of Wheels for Vehicle = " + super.numberOfWheels); // calling Super class
    }
}

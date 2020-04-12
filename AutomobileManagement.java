package com.vijayjiragal;

public class AutomobileManagement {

    public static void main(String[] args) {

        Car mercedes = new Car();
        Car bmw = new Car();
        mercedes.numberOfWheels=4;

        Bike ducati = new Bike();
        ducati.numberOfWheels=2;

//        bmw.move();
//        ducati.move();

        Vehicle vehicle1 = new Car();
        vehicle1.move();
        ducati.printNoOfWheels();
    }

}

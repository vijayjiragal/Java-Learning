package com.vijayjiragal;

    //abstract class
    abstract class PlanetAnimal {

    //Abstract Methods will not have body or implementation
    public abstract void animalSound();

    //Regular Methods
    public void sleep(){
        System.out.println("Sleeping!!!!");
    }
}

//subclass inheriting from superclass

class Elephant extends PlanetAnimal {

    public void animalSound(){
        // Implementation of abstract method from abstract class
        System.out.println("Elephant Roars");
    }
}

class AbstractionDemo {

    public static void main(String[] args) {
        PlanetAnimal babyElephant = new Elephant();
        babyElephant.animalSound();
        babyElephant.sleep();
    }
}

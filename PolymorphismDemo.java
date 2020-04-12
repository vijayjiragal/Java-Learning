package com.vijayjiragal;

class Animal{
    public void animalSound(){
        System.out.println("Each Animal has its own Sound");
    }
}

class Pig extends Animal{

    public void animalSound() {
        System.out.println("Pig says --> Oink Oink");
    }
}

class Dog extends Animal{

    public void animalSound() {
        System.out.println("Dog says --> Bow Wow");
    }
}

public class PolymorphismDemo {

    public static void main(String[] args) {

        Animal myAnimal = new Animal();                 //Creating Animal Object
        Animal myPig = new Pig();                       //Creating Pig Object
        Animal myDog = new Dog();                       //Creating Dog Object

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}

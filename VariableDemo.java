package com.vijayjiragal;

public class VariableDemo {

//Instance Variables
int data = 15; // Instance Variable
// data = 20;   // Cannot re-initialize value to Instance Variable in class scope.

    void someMethod(){
        data = 20;  // But can be initialized inside a method.
    }

//Static Variables
static int number = 50; // Only one copy is created per class


    public static void main(String[] args) {

        int a = 10; // Initilizing a local variable
        a = 150;       // Local variables can be modified
        System.out.println("Printing Local Variable " + a);
        System.out.println("Printing static variable " + VariableDemo.number);
        VariableDemo vr = new VariableDemo();
        System.out.println("Printing Instance Variable " + vr.data);

    }

}

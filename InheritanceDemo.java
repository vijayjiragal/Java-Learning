package com.vijayjiragal;

class myVehicle {
    protected String brand = "Ford";         //Vehicle Attribute mad protected so that child class would be able to acces it. If private child class cannot use it
    public void honk(){                      //Vehicle Method
        System.out.println("Honk! Honk!");
    }
}

final class newVehicle{
    // Final class cannot be inherited. Compiler Error
}


public class InheritanceDemo extends myVehicle{

    public String modelName = "Mustang";           // Car Attribute

    public static void main(String[] args) {
        InheritanceDemo myCar = new InheritanceDemo();          // creating myCar object from template myVehicle
        myCar.honk();                                           // calling Honk method from myVehicle class on myCar object
        System.out.println("My Car brand is "+ myCar.brand + " and its model is " + myCar.modelName);
    }
}

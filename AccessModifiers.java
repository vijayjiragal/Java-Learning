package com.vijayjiragal;

class OuterClass{

   static int myValue = 10;
   private int privateValue = 20;
   protected int protectedValue = 30;
   public int publicValue =100;


    private static void myPrivateStaticTest(){
        System.out.println("This is a private access modifier from static method");
    }

    private void myPivateNonStaticTest(){
        System.out.println("This is a private access modifier from non-static method");
    }

}

public class AccessModifiers {

  /* scope of visibility in increasing order
 # Private --> Visibility within same class
 # Default --> Visibility within same package
 # Protected --> Visibility within same package and all sub-classes
 # Public- --> Visibility to whole world
  */

    public static void main(String[] args) {


      // myOuterClass.myPrivateStaticTest(); //PrivateStaticMethod--> cannot be called from different class of same package.
        OuterClass obj = new OuterClass();
      // obj.myPivateNonStaticTest();// //PrivateNonStaticMethod--> cannot be called from different class of same package.

        System.out.println(OuterClass.myValue); // static can be accessed anywhere in same package using classname
        System.out.println("Our Public Value is " + obj.publicValue);
        System.out.println("Protected Value is " + obj.protectedValue);
       // System.out.println("Protected Value is " + obj.privateValue); //cannot access private elements of another class

    }




}

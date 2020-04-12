package com.vijayjiragal;

class IamOuterClass{
    int x= 10;

    class iamInnerClass{
        int y=20;
    }

   private  class iamPrivateInnerClass{
        int z = 100;
    }

    static class iamStaticInnerClass{
        int a = 200;
    }
}

public class InnerClassDemo {

    public static void main(String[] args) {
        IamOuterClass myOuter = new IamOuterClass();
        IamOuterClass.iamInnerClass myInner = myOuter.new iamInnerClass();
        System.out.println(" I am from Outerclass " + myOuter.x);
        System.out.println(" I am from InnerClass " + myInner.y);

        // Trying to call private inner class
       // IamOuterClass.iamPrivateInnerClass myPrivateInner = myOuter.new iamPrivateInnerClass(); compiler error

        // Trying to call Static Inner class. Static class can be called without creating objects
        IamOuterClass.iamStaticInnerClass myStatic = new IamOuterClass.iamStaticInnerClass();
        System.out.println(" Static Value is " + myStatic.a);
    }
}

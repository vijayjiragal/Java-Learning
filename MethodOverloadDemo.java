package com.vijayjiragal;

public class MethodOverloadDemo {

    public int calculateSum(int a, int b){
        return a+b;
    }

    public int calculateSum(int a, int b, int c){
        return a+b+c;
    }

    public String calculateSum(String a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
         MethodOverloadDemo mold = new MethodOverloadDemo();

        System.out.println(mold.calculateSum(10,20));                  // All same data types

        System.out.println(mold.calculateSum(10, 20, 30));           // All same data types

        System.out.println(mold.calculateSum("JavaWolrd", 10, 20));  // Different data types



    }
}

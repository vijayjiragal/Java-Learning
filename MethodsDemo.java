package com.vijayjiragal;

public class MethodsDemo {

    public Integer sum (Integer a , Integer b){
        return  a + b ;
    }

    public Integer product (Integer a , Integer b){
        return a * b;
    }

    public static void main(String[] args) {

        MethodsDemo obj = new MethodsDemo();
        System.out.println("Sum is " + obj.sum(10, 20));
        System.out.println("Product is " + obj.product(10, 20));
    }
}

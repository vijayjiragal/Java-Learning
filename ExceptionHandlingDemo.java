package com.vijayjiragal;


public class ExceptionHandlingDemo {
    static void checkAge (int age){
        if (age <18){
            throw new ArithmeticException( " Acces Denied- Not allowed to Enter Pubs");
        } else {
            System.out.println("Access Agranted- You are old enough to enter pub");
        }
    }
    public static void main(String[] args) {
        try {
            int[] myArray = {1, 2, 3, 4, 5};
            System.out.println(myArray[10]);
        } catch (Exception e){ System.out.println("Something went wrong!!"); }
        finally { System.out.println("Try Catch block is complete"); }

        checkAge(15);
    }



}

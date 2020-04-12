package com.vijayjiragal;

public class DataTypeDemo {

    int number = 20;

    public static void main(String[] args) {


        //Primitive Data Types
        System.out.println("Byte");
        System.out.println("Max range :"  + Byte.MAX_VALUE);
        System.out.println("Min range :" + Byte.MIN_VALUE);
        System.out.println("------------------------------------------------------") ;
        System.out.println("Short" );
        System.out.println("Max range :"  + Short.MAX_VALUE);
        System.out.println("Min range :" + Short.MIN_VALUE);
        System.out.println("------------------------------------------------------") ;
        System.out.println("Int" );
        System.out.println("Max range :"  + Integer.MAX_VALUE);
        System.out.println("Min range :" + Integer.MIN_VALUE);
        System.out.println("------------------------------------------------------") ;
        System.out.println("Long" );
        System.out.println("Max range :"  + Long.MAX_VALUE);
        System.out.println("Min range :" + Long.MIN_VALUE);
        System.out.println("------------------------------------------------------") ;
        System.out.println("Float" );
        System.out.println("Max range :"  + Float.MAX_VALUE);
        System.out.println("Min range :" + Float.MIN_VALUE);
        System.out.println("------------------------------------------------------") ;
        System.out.println("Double " );
        System.out.println("Max range :"  + Double.MAX_VALUE);
        System.out.println("Min range :" + Double	.MIN_VALUE);

        System.out.println( 10 ); // 10
        System.out.println( (float)10 ); // 10.0

        System.out.println('a');  // a
        System.out.println((int)'a');   // 97
        System.out.println((char)122) ; // z
        System.out.println((char)89) ; //
        System.out.println((int)'0') ; //

        double a = 10.23 ;
        System.out.println(a )  ; // 10.23
        float b  = ( float) a ; // double to float
        System.out.println( b ) ;// 10.23
        long c = (long) a ;  // double to long
        System.out.println(c)  ; // 10
        int d = (int ) a  ;
        System.out.println(d)  ; // 10


        //Non-Primitive Data Types
        DataTypeDemo obj = new DataTypeDemo();
        System.out.println(obj.number); // Non primitive Data

    }


}

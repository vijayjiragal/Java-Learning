package com.vijayjiragal;

public class ForLoopPatterns {

/*

 *****
 *****
 *****
 *****
 *****
 */

    public static void main(String[] args)
    {
        int lines = 5 ;
        int col = 5 ;
        for (int i = 0 ; i < lines  ; i++  )
        {
            for (int j = 0 ; j < col  ; j++  )
            {
                System.out.print("*" ) ;
            }
            System.out.println( ) ;
        }
    }
}
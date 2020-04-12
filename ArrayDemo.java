package com.vijayjiragal;

public class ArrayDemo {

    public static void main(String[] args) {


        //Single Dimensional
        //Declare an Array and find Length of an Array by length function
        int[] x = new int[10];
        System.out.println(x.length);

        //printing element at particular index
        System.out.println(x[2]);                                      //Prints Zero as Values are not declared

        x = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};       // Declaring Values to Array
        System.out.println(x[2]);                                      // finding value by Index

        //System.out.println(x[11]);                                     // Array Out Of Bound Exception (Run Time)

        //Print All Array Items
        for (int value : x) {
            System.out.println(value);
        }

        //MultiDimensional
        int[][] z =
                {
                        {1, 2, 3},
                        {4, 5, 6}
                };
        System.out.println("Length of Row 1 = " + z[0].length);

        //Copying elements in Array
        char[] source = {'H', 'A', 'P', 'P','Y', 'L', 'E', 'A','R', 'N', 'I', 'N', 'G'};
        char [] destination = new char[7];

        System.arraycopy(source, 0, destination, 1, 5 );
        System.out.println(new String(destination));

        //Array Element Deletion
        int flag = 3; //Item to be deleted
        for (int i= 0;i<source.length;i++){
            if (flag == i){
                for (int j = i +1; i < source.length - 1; j++){
                    source [i] = source [j];
                    i++;
                }
                System.out.println(source);
            }
        }

    }
}

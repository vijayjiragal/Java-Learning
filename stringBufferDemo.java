package com.vijayjiragal;

public class stringBufferDemo {

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Java");

        // Append Method
        str.append("World");
        System.out.println(str);

        //Insert Method
        str.insert(0, '@');
        System.out.println(str);

        //Replace Method
        str.replace(5, 10, "Script");
        System.out.println(str);

        //Delete Method
        str.delete(5, 11);
        System.out.println(str);

        //Reverse
        str.reverse();
        System.out.println(str);

        //Capacity
        System.out.println(str.capacity());
    }
}

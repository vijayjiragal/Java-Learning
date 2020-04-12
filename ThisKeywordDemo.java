package com.vijayjiragal;

class ClassInfo {
int rollNo;
String name;

    public ClassInfo(int rollNo, String name) {
        this.rollNo = rollNo;         // This keyword is used to differentiate instance variable and local variables
        this.name = name;
    }

    void display (){
        System.out.println("Roll No is = " + rollNo + " Name is = " + name);
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {

        ClassInfo std1 = new ClassInfo(1, "Apoorva");
        ClassInfo std2 = new ClassInfo(2, "Abhshek");

        std1.display();
        std2.display();

    }

}

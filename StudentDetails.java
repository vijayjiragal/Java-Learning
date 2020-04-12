package com.vijayjiragal;


public class StudentDetails {

    public String studentName;
    public int studentMarks;

    //Default Constructor
    public StudentDetails() {

        //Calling constructor with String Parameter
        this("KirikParty");
    }

    //Constructor with String Parameter
    public StudentDetails (String name){

        //Calling constructor with String and int parameter
        this(name, 99);
    }

    //Constructor with String and Int parameter
    public StudentDetails (String name, int marks){
        this.studentName = name;
        this.studentMarks = marks;
    }

    void display(){
        System.out.println("Student Name is = " + studentName);
        System.out.println("Student marks are = "+ studentMarks);
    }

    public static void main(String[] args) {
        StudentDetails sd = new StudentDetails();
        sd.display();

    }
}

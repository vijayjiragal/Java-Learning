package com.vijayjiragal;

class StudentInfo{

    String studentName;
    int rollNumber;

    public StudentInfo(String studentName, int rollNumber) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        System.out.println(" I am not default constructor");
        System.out.println(" I am " + studentName + " And My Roll Number is = " + rollNumber);
    }

    public StudentInfo() {
        System.out.println(" I am Default constructor for Class StudentInfo");
    }

}

public class ConstructorsDemo {
    public static void main(String[] args) {
        StudentInfo s1 = new StudentInfo();
        StudentInfo S2 = new StudentInfo("Vijay", 99);

    }



}

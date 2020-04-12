package com.vijayjiragal;

public class StaticEmployee {
    //Static Blocks and Static Variables

    int id;
    int salary;
    static String company = "Accenture LLP";   // static variable

    private static void officeHours(){
        System.out.println("Office Hours are 9 am to 5 pm");
    }

    public StaticEmployee(int id, int salary) {
        this.id = id;
        this.salary = salary;
    }

    public void display(){
        System.out.println("Employee ID is " + id + "  whose salary is = $" + salary + " and  Working for " + company);
    }

    public static void main(String[] args) {

        StaticEmployee emp1 = new StaticEmployee(10001, 100000);
        StaticEmployee emp2 = new StaticEmployee(10002, 200000);

        emp1.display();
        emp2.display();
        officeHours();   // static methods can be called without instantiating the objects as their Memory Allocation is fixed.

    }
}

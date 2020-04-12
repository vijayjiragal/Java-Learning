package com.vijayjiragal;

class Employee{
    private String name;
    private String address;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }
}

public class EncapsulationDemo {

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setName("Vijay");
        emp1.setAddress("Columbus");

        System.out.println("Employee Name is " + emp1.getName() + " And Address is " + emp1.getAddress());
    }
}

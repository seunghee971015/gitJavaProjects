package com.kh.empandstu;

public class Employee extends Person {
    private int salary;
    private String dept;

    public Employee() {
        super();
    }

    public Employee(String name, int age, double height, double weight, int salary, String dept) {
        super(name, age, height, weight);
        this.salary = salary;
        this.dept = dept;
    }

    // Getter and Setter methods

    public String toString() {
        return super.toString() + ", " + salary + ", " + dept;
    }
}

package com.kh.empandstu;

public class Student extends Person {
    private int grade;
    private String major;

    public Student() {
        super();
    }

    public Student(String name, int age, double height, double weight, int grade, String major) {
        super(name, age, height, weight);
        this.grade = grade;
        this.major = major;
    }

    // Getter and Setter methods

    public String toString() {
        return super.toString() + ", " + grade + ", " + major;
    }
}

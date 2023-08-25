package com.kh.empandstu;

public class Person {
    private String name;
    private int age;
    private double height;
    private double weight;

    public Person() {
    }

    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String toString() {
        return name + ", " + age + ", " + height + ", " + weight;
    }
}

package com.kh.empandstu;

public class PersonController {
    private Student[] students = new Student[3];
    private int studentCount = 0;
    private Employee[] employees = new Employee[10];
    private int employeeCount = 0;

    public int[] personCount() {
        return new int[] { studentCount, employeeCount };
    }

    public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
        if (studentCount < students.length) {
            students[studentCount] = new Student(name, age, height, weight, grade, major);
            studentCount++;
        }
    }

    public Student[] printStudent() {
        return students;
    }

    public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
        if (employeeCount < employees.length) {
            employees[employeeCount] = new Employee(name, age, height, weight, salary, dept);
            employeeCount++;
        }
    }

    public Employee[] printEmployee() {
        return employees;
    }
}

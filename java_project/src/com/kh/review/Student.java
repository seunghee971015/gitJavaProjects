package com.kh.review;

public class Student {
	private int age;
	private String gender;
	private int grade;
	
	public Student() {
		
	}
	
	public Student(int age, String gender, int grade) {
		this.age = age;
		this.gender = gender;
		this.grade = grade;
	}
	
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getGrade() {
		return this.grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return this.age + this.gender + this.grade;
	}

}

package com.kh.assignment0818;

public class Human {
	private String name;
	private int age;
	private char gender;
	private String job;
	
	public Human(String name,int age, char gender, String job) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.job = job;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getJob() {
		return job;
	}
	public void setJob() {
		this.job = job;
	}
	
	public String toString() {
		return name+"\t"+age+"\t"+gender+"\t"+job;
	}
}

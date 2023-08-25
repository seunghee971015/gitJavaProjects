package com.kh.OOP5;

public class Student extends Human implements Swimmable, Sleepable {
	
	public Student(String name, int age) {
		super(name, age);
	}

	@Override
	public void swim() {
		System.out.println(super.getName() + "님은 수영을 합니다");
		
	}
	@Override
	public void sleep() {
		System.out.println(super.getName() + "님은 잠을 잡니다");
		
	}

	@Override
	public void makeSound() {
		System.out.println("저는 " + getName() + "이고 " + getAge() + "살 입니다");
		
	}
	
	

}

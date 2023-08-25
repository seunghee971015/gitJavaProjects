package com.kh.khanun;

public class Dog extends Animal {
	
	public Dog(String name, int age, String gender) {
		super(name, age, gender);
	}
	
	public void welcomeHome() {
		System.out.print("꼬리를 흔듭니다");
	}
	
	@Override
	void makeSound() {
		System.out.println("멍멍");
	}
}


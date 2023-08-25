package com.kh.OOP3;
//Animal 추상클레스 작성
// 필드 값 : String name, int age
// 필드를 초기화하는 생성자 작성
// 추상메서드 makeSound : 매게변수와 반환값(리턴값)이 없음

public abstract class Animal {
	protected String name;
	protected int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public abstract void makeSound();

}

package com.kh.interfacePrinter;

public class Dog implements Animal{
	
	@Override
	public void eat(String food) {
		System.out.println(food + "가 너무 맛있다(멍멍)");
	}
	
	@Override
	public void move() {
		System.out.println("멍멍(꼬리를 흔들며)");
	}

}

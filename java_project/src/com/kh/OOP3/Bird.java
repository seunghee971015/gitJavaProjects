package com.kh.OOP3;
//Bird 클레스 작성
// Animal을 상속받고, Flyable를 구현함
// fly메서드에서는 "oo는 하늘을 날아다닌다" 출력
// makeSound메서드 "oo이 하늘에서 울고있습니다." 출력

public class Bird extends Animal implements Flyable{

	public Bird(String name, int age) {
		super(name, age);
	}
	@Override
	public void fly() {
		System.out.println(this.name + "가 하늘을 날아다닌다");
		
	}

	@Override
	public void makeSound() {
		System.out.println(this.name + "가 하늘에서 울고있습니다");
		
	}
	

}

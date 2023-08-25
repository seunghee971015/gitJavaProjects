package com.kh.review;

public class Human {
	private String name;
	private int age;
	private String residentNumber;
	private char gender; // f ->여자 m-> 남자
	
	// 필드를 전부 초기화하는 매개변수를 가지고 있는 생성자
	// 생성자 : 객체의 데이터들을 전부 초기화하기 위한 특수목적의 매서드
	// 리턴값을 가지고있지 않고 객체 생성시 1번만 호출된다.
	// 오버로딩 가능 / 매서드이지만 이름은 클래스와 동일하다.
	public Human(String name, int age, String residentNumber, char gender) {
		this.name = name;
		this.age = age;
		this.residentNumber = residentNumber;
		this.gender = gender;
	}
	
	public Human(String name, int age) {
		this(name, age, "미입력", 'f');
	}
	//오버로딩 :
	//매서드의 이름이 같아도 매개변수의 숫자나, 자료형이 다르면 구분이 가능하다
	
	//접근제한자 반환자료형 메서드이름(매개변수){
	//실행할 코드
	//return (반환자료형에 맞는 값);
	//}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getResidentNumber() {
		return this.residentNumber;
	}
	public void setResidentNumber(String residentNumber) {
		this.residentNumber = residentNumber;
	}
	public String getGender() {
		return this.name;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String getFutureAge() {
		return "제 10년 후 나이는 " + (getAge() + 10) + "살 입니다";
	}
	
	@Override
	public String toString() {
		return this.name+"\t"+ this.age +"\t"+ this.gender +"\t"+ this.residentNumber;
	}
	
	

}

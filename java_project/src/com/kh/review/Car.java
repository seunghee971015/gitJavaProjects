package com.kh.review;

public class Car {
	private String brand;
	private String color;
	private String forWhom;
	
	public Car() {
		
	}
	
	public Car(String brand, String color, String forWhom) {
		this.brand = brand;
		this.color = color;
		this.forWhom = forWhom;
	}
	
	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getForWhom() {
		return this.forWhom;
	}
	public void setForWhom(String forWhom) {
		this.forWhom = forWhom;
	}
	
	@Override
	public String toString() {
		return this.brand+"\t"+this.color+"\t"+this.forWhom;
	}
	

}

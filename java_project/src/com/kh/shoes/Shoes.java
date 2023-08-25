package com.kh.shoes;

public class Shoes {
	private String brand;
	private String kind;
	private String color;
	private int quantity;
	private int size;
	
	public Shoes() {
		
	}
	
	
	public Shoes(String brand, String kind, String color, int quantity, int size) {
		this.brand = brand;
		this.kind = kind;
		this.color = color;
		this.quantity = quantity;
		this.size = size;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getColor() {
		return color;
	}
	public void setcolor(String color) {
		this.color = color;
	}
	public int getQuantity() {
		return size;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getsize() {
		return size;
	}
	public void setsize(int size) {
		this.size = size;
	}
	
	public String toString() {
		return brand+"\t"+ kind+"\t"+color+"\t"+quantity+"\t"+size;
	}
	
	
}


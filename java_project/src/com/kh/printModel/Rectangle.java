package com.kh.printModel;

public class Rectangle extends Point{
	private int width;
	private int height;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public void setWidth() {
		this.width = width;
	}
	public void setHeight() {
		this.height = height;
	}

}

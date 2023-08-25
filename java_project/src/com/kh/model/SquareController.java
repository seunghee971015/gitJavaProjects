package com.kh.model;

public class SquareController extends Shape{
	private Shape s;

	public SquareController() {
        s = new Shape();
    }

    public double calcPerimeter(double height, double width) {
        s = new Shape(4, height, width); // 4는 사각형
        return s.getWidth() * 2 + s.getHeight() * 2;
    }

    public double calcArea(double height, double width) {
        s = new Shape(4, height, width); // 4는 사각형
        return s.getWidth() * s.getHeight();
    }

    public void paintColor(String color) {
        s.setColor(color);
    }

    public String print() {
        return "사각형\n" + s.information();
    }
}

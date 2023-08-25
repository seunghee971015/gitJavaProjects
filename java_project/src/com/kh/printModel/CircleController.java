package com.kh.printModel;

public class CircleController {
	private Circle c = new Circle();
	
	public CircleController() {
		
	}
	public CircleController(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
	}
	
	public String calcArea(int x, int y, int width, int radius) {
		c = new Circle(x, y, radius);
		return "면적 : " + Math.PI * c.getRadius() * c.getRadius();
	}
	
	public String calcPerimeter(int x, int y, int width, int radius) {
		c = new Circle(x, y, radius);
		return "둘레 :  " + Math.PI * c.getRadius() * c.getRadius(); 
	}

}

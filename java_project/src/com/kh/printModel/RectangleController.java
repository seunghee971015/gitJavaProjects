package com.kh.printModel;

public class RectangleController {
	private Rectangle r;
	
	public RectangleController() {
		r = new Rectangle();
	}
	
	public String calcArea(int x, int y, int height, int width) {
		r = new Rectangle(x, y, height, width);
		return "면적 : " + width * height;
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
		r = new Rectangle(x, y, height, width);
		return "둘레 : " + 2 * (width + height);
	}

}

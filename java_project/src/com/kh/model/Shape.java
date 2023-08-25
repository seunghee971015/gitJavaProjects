package com.kh.model;

public class Shape {
	 private int type;
	    private double height;
	    private double width;
	    private String color;

	    //생성자
	    public Shape() {
	    	color = "white";
	    }

	    public Shape(int type, double height, double width) {
	    	this();
	        this.type = type;
	        this.height = height;
	        this.width = width;
	    }

	    //get
	    public int getType() {
	        return type;
	    }

	    public double getHeight() {
	        return height;
	    }

	    public double getWidth() {
	        return width;
	    }
	    
	    public String getColor() {
	        return color;
	    }

	    public void setHeight(double height) {
	        this.height = height;
	    }

	    public void setWidth(double width) {
	        this.width = width;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }
	    
	    public String information() {
	        return " " + height + " " + width + " " + color;
	    }
}

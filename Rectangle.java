package com.prakash.geom;

public class Rectangle extends Shape{

	double length,width;
	
	
	
	
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	public Rectangle(double length, double width,String color, boolean filled) {
		super(color, filled);
		this.length = length;
		this.width = width;
		// TODO Auto-generated constructor stub
	}
	
	
	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return length * width;
	}

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * (length + width);
	}


	@Override
	public String toString() {
		return "Rectangle [color=" + color + ", filled=" + filled + ", length=" + length + ", width=" + width + "]";
	}
	
	

}

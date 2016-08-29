package com.prakash.geom;

public class Square extends Rectangle {
	
	
	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
		// TODO Auto-generated constructor stub
	}

	public Square(double side) {
		super(side,side);
		
	}
	public void setLength(double side) {
		super.length = side;
	}
	public void setWidth(double side) {
		super.width = side;
	}

	public double getSide() {
		return super.length;
	}

	public void setSide(double side) {
		super.length = side;
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return super.length * super.width;
	}

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return 4 * super.length;
	}

	@Override
	public String toString() {
		return "Square [length=" + length + ", width=" + width + ", color=" + color + ", filled=" + filled + "]";
	}
	
}

package com.prakash.geom;

public class Circle extends Shape{
	
	double radius;
	

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle(String color, boolean filled,double radius) {
		super(color, filled);
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}
	

	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + ", filled=" + filled + "]";
	}
	
	

}

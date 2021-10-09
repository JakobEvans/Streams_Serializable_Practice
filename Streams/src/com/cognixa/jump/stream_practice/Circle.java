// Jakob Evans
// 9/15/21
// Method Overriding


package com.cognixia.jump.java8_streams;

public class Circle extends Shape {
	private double radius; 
	

	public Circle() {
		super("circle", "noColor");
		this.radius = 0;
	}
	
	public Circle(String color, double radius) {
		// pass back to super class
		super("circle", color);
		this.radius = radius;
	}
	
	@Override
	public Double Area() {
		return radius * radius * Math.PI;
	}
	
	@Override
	public void printShapeData() {
		System.out.println("\nType is : " + super.getType() + ", Color is : " + super.getColor() + ", Radius length is: " + radius);
		
	}
	

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}








}

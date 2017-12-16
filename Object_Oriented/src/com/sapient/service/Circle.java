package com.sapient.service;

public class Circle {
	
	public double radius;
	
	public double calcArea() {
		double area = Math.pow(radius,2) * Math.PI;
		return area;
	}
	
	public double calcPerimeter() {
		double perimeter = 2 * radius * Math.PI;
		return perimeter;
	}

}

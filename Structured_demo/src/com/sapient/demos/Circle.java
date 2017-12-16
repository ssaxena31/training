package com.sapient.demos;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter radius of circle : ");
		double r = scan.nextDouble();
		double area = calcArea(r);
		double perimeter = calcPer(r);
		System.out.println("Area = " + area);
		System.out.println("Perimeter = " + perimeter);
		scan.close();

	}
	
	public static double calcArea(double radius) {
		double area = Math.pow(radius,2) * Math.PI;
		return area;
	}
	
	public static double calcPer(double radius) {
		double per = 2 * radius * Math.PI;
		return per;
	}

}

package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Circle;
import com.sapient.util.SapUtil;

public class CircleClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Circle obj = new Circle();
		System.out.println("Enter radius of circle : ");
		obj.radius = scan.nextDouble();
		double area = obj.calcArea();
		double perimeter = obj.calcPerimeter();
		System.out.println("Area = " + SapUtil.roundUp2Dec(area));
		System.out.println("Perimeter = " + SapUtil.roundUp2Dec(perimeter));
		scan.close();

	}

}

package com.sapient.demos;

import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount");
		double amt = scan.nextDouble();
		System.out.println("Enter the years");
		int years = scan.nextInt();
		System.out.println("Enter the rate of interest");
		float rate = scan.nextFloat();
		
		double si = calcSimple(amt,years,rate);
		double ci = calcCompound(amt,years,rate);
		System.out.println("Simple Interest : " + si);
		System.out.println("Compound Interest : " + ci);
		scan.close();

	}
	
	public static double calcSimple(double amt,int years,float rate)
	{
		double si = amt * years * rate /100;
		return si;
	}
	
	public static double calcCompound(double amt,int years,float rate)
	{
		double ci = amt * Math.pow((1+rate/100),years);
		return ci;
	}

}

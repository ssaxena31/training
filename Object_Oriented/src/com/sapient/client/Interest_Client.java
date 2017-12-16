package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Interest;
import com.sapient.util.SapUtil;

public class Interest_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Interest obj = new Interest();
		System.out.println("Enter the amount");
		obj.amt = scan.nextDouble();
		System.out.println("Enter the rate of interest");
		obj.rate = scan.nextFloat();
		System.out.println("Enter the years");
		obj.years =scan.nextInt();
		double si = obj.calcSimple();
		double ci = obj.calcCompound();
		System.out.println("Simple Interest : " + SapUtil.roundUp2Dec(si));
		System.out.println("Compound Interest : " + SapUtil.roundUp2Dec(ci));
		scan.close();

	}

}

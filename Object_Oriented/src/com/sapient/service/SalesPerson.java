package com.sapient.service;

import com.sapient.util.SapUtil;

public class SalesPerson {

	public int id;
	public String name;
	public double sales;
	public static int noOfPersons;
	public static double tSales;

	public SalesPerson(int id, String name, double sales) {
		super();
		this.id = id;
		this.name = name;
		this.sales = sales;
		++noOfPersons;
		tSales = tSales + this.sales;
	}

	public double calcSalesComm() {
		double salcomm;
		if (sales >= 50000)
			salcomm = sales * 0.1;
		else if (sales >= 20000 && sales < 50000)
			salcomm = sales * 0.05;
		else
			salcomm = sales * 0.03;
		return salcomm;
	}

	public void display() {
		System.out.println(id + "  " + name + "  " + sales + "  " + SapUtil.roundUp2Dec(calcSalesComm()));
	}

}

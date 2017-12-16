package com.sapient.client;

import com.sapient.service.SalesPerson;

public class SalesClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalesPerson s1 = new SalesPerson(1001, "Ram", 45000);
		SalesPerson s2 = new SalesPerson(1002, "Tom", 23000);
		SalesPerson s3 = new SalesPerson(1003, "Sam", 12000);
		s1.display();
		s2.display();
		s3.display();
		System.out.println("No. of Persons : " + SalesPerson.noOfPersons);
		System.out.println("Total Sales : " + SalesPerson.tSales);

	}

}

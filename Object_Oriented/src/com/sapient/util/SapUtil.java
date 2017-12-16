package com.sapient.util;

public class SapUtil {

	public static double roundUp2Dec(double val) {

		double value = Math.round(100 * val) / 100.0;
		return value;
	}
}

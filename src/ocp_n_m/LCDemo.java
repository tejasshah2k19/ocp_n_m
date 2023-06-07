package ocp_n_m;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class LCDemo {

	public static void main(String[] args) {
		// mm-dd-yyyy
		// 01-02-2023

		Date d = new Date();// util sql
		System.out.println(d);

		DateFormat d1 = DateFormat.getDateInstance(); // format
		DateFormat d2 = DateFormat.getDateInstance(DateFormat.SHORT); // format
		DateFormat d3 = DateFormat.getDateInstance(DateFormat.MEDIUM); // format
		DateFormat d4 = DateFormat.getDateInstance(DateFormat.LONG); // format
		DateFormat d5 = DateFormat.getDateInstance(DateFormat.FULL); // format

		
		System.out.println(d1.format(d));
		System.out.println(d2.format(d));
		System.out.println(d3.format(d));
		System.out.println(d4.format(d));
		System.out.println(d5.format(d));
		
		
		System.out.println("=-------------------------------------------------=");
		
		Locale us = new Locale("EN", "US");
		Locale fr = new Locale("fr");
		Locale es = new Locale("es");
		
		
		DateFormat d6 = DateFormat.getDateInstance(DateFormat.FULL,fr); // format
		System.out.println(d6.format(d));
		
		DateFormat d7 = DateFormat.getDateInstance(DateFormat.FULL,es); // format
		System.out.println(d7.format(d));
		
		
		
	}
}

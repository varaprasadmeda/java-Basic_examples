package com.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

	public static void main(String[] args) throws ParseException {
		String date1 ="11/10/2018";
		String date2 = "15-Mar-2019 21:11:35";
		
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
		Date formattedDate1 = dateFormat1.parse(date1);
		Date formattedDate2 = dateFormat2.parse(date2);
		
		System.out.println(formattedDate1);
		System.out.println(formattedDate2);
	}

}


package com.java;

import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) {

		System.out.println("Please enter the  Value : ");
				
		int num = Integer.parseInt(args[0]);
		for(int i = 1; i<=10 ; i++) {
			System.out.println(num+"*"+i+"="+(num*i));
		}
  
	}

}

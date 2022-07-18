package com.java.second;

public class NumberReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 12345;  // output 54321
		System.out.println("Before Reverse "+num);
		int reverse = 0;
		while(num !=0) {
			
			int remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num/10;
			
		}
     System.out.println("After Reverse "+reverse);
	}

}

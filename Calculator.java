package com.java;

public class Calculator {
	
	static int a=10;
	static int b=20;
	
	public static void main(String[] args) {
		
		//System.out.println(a+b);
		//System.out.println(a-b);
		//System.out.println(a*b);
		 
		//System.out.println(add(a,b));
		//System.out.println(sub(a,b));
		//System.out.println(mul(a,b));
		
		Calculator cal= new Calculator();
		
		int add = cal.add(a,b);
		System.out.println(add);
		
		int sub = sub(a,b);
		System.out.println(sub);
		
		int mul = mul(a,b);
		System.out.println(mul);
		
	}
	
	public int add(int a, int b) {		
		return a+b;
	}
	public static int sub(int a, int b) {		
		return a-b;
	}
	public static int mul(int a, int b) {		
		return a*b;
	}
	
	
	

}

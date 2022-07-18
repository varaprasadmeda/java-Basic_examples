package com.java.second;

import com.java.first.First;


public class Second {
	
	public static void main(String[] args) {
		
		First first = new First();
		String m1 = first.m1();
		System.out.println(m1);
		
		String m2 = first.m2();
		System.out.println(m2);
		System.out.println(first.m3());
		
		System.out.println(first.add(10,20));
		
		
		
		
	}

}

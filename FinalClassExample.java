package com.java.second;

public class FinalClassExample {

	
	public static void main(String[] args) {
		
		int a = 30;     // primitive value
		
		Integer i = Integer.valueOf(a);  // converting in to Object
		
		Integer j = a;    // Autoboxing   converting primitive to wrapper Object
		
		int b = j;  //Auto Unboxing  Converting Wrapper Object
		
		System.out.println(a+ " "+i+" "+j+" "+b );
		
		//System.out.println(a+i+j );
		
		
	}
}

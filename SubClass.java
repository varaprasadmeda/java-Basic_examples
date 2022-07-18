package com.java.second;

public class SubClass extends Superclass {

	
	public String getName() {
		System.out.println("Sub");
		return "Sub";

	}

	
	public static void main(String[] args) {
		
		//Case1
		Superclass  superC = new Superclass();   // We can create Super class Object and can call super class method only. We can not call sub class methods
		superC.getName();
		//superC.getCountry(); Not available in t SuperClass
		
		//Case 2
		SubClass sub = new SubClass();   // We can create Sub class Object and can call Super and Sub class method also. 
		sub.getName();    // Coming from SuperClass
		sub.getName(); // Coming from SubClass
		
		//Case 3
		Superclass super2 = new SubClass(); // Super class reference variable pointing to Sublcass Object. By using this reference variable we  can call super classs methods
		super2.getName();
		
		//Case 
		//SubClass sub = new Superclass();
		
		
	}


}

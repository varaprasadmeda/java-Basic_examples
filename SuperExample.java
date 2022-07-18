package com.java.second;

public class SuperExample extends SuperClassExmp {
	
	String color = "Blue";
	
	SuperExample(){
		super();
	}
	
	
	public void displayColor() {
		
		System.out.println(color);
		System.out.println(super.color);
		//System.out.println(super());
	}
	
	public static void main(String[] args) {
		
		SuperExample  superE= new SuperExample();
		superE.displayColor();
		
	}

}

//this - - to refer current class instance variables and instance methods
//super -  to refer parentt class instance variables and instance methods
//this() - to refer current class constructor
//super() - to refer parent class constructor

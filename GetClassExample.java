package com.java;

public class GetClassExample {

	public static void main(String[] args) {
		 Object obj = new String("JavaTpoint");   
	        Class a = obj.getClass();   
	        System.out.println("Class of Object obj is : " + a.getName());

	}

}

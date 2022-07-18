package com.java.second;

import com.java.first.First;

public class ObjectClassExample {

	public static void main(String[] args) {
		
		First first = new First();
		System.out.println(first.hashCode());
		

		First first1 = new First();
		System.out.println(first1.hashCode());
		
		//if(first.equals(first1)) {
		if(first == first1) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
		
	}

}

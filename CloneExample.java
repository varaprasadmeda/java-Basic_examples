package com.java;

public class CloneExample implements Cloneable {

	int i = 10;
	int j = 20;

	public static void main(String[] args) throws CloneNotSupportedException {
		CloneExample clon1 = new CloneExample();
		CloneExample clon2 = clon1;      //shallow cloning
		CloneExample clon3 = (CloneExample) clon1.clone(); //Deep cloning
		clon2.i = 888;
		clon2.j = 999;
		System.out.println(clon1.i+"-------"+clon1.j);   // 10-------20
		
		System.out.println(clon1.hashCode() == clon2.hashCode());  //false
		System.out.println(clon1 == clon2);                        //false

	}

}

package com.java.second;

public class StringExample {

	public static void main(String[] args) {

		String str = new String("Varaprasad");
		System.out.println(str.hashCode()); //1370460049
		System.out.println(str);
		System.out.println();
		
		str = str.concat("hyd");
		System.out.println(str);
		System.out.println(str.hashCode()); //-583692222
				
	}

}

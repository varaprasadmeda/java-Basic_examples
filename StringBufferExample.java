package com.java.second;

public class StringBufferExample {
	
	public static void main(String[] args) {
		
		//StringBuffer strBuff = new StringBuffer("Varaprasad");
		StringBuilder strBuff = new StringBuilder("Varaprasad");
		System.out.println(strBuff.hashCode()); //1370460049
		System.out.println(strBuff);
		System.out.println();
		
		strBuff = strBuff.append("hyd");
		System.out.println(strBuff.length());
		System.out.println(strBuff);
		System.out.println(strBuff.hashCode()); //-583692222
		
	}

}

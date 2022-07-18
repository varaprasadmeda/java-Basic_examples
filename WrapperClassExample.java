package com.java.second;

public class WrapperClassExample {
	
	public static void main(String[] args) {
		
		//primitive
		byte b=10;
		short s =20;
		long l =30;
		int i = 40;
		float f = 40.0f;
		double d = 60.0D;
		char c = 'a';
		boolean bool = true;
		
		
		//Converting in to Wrapper Object
		Byte byteObj = b;
		Short shortObj = s;
		Long longObject = l;
		Integer integerObj = i;
		Float floatObj = f;
		Double doubleObj = d;
		Character charObj = c;
		Boolean boolObf = bool;
		
		System.out.println(" =====> Printing Object Values  <====== ");
		System.out.println("Byte Object = "+byteObj);
		System.out.println("Short Object = "+shortObj);
		System.out.println("Long Object = "+longObject);
		System.out.println("Integer Object = "+integerObj);
		System.out.println("Float Object = "+floatObj);
		System.out.println("Double Object = "+doubleObj);
		System.out.println("Character Object = "+charObj);
		System.out.println("Boolean Object = "+boolObf);
		
	}

}

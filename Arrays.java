package com.java;

public class Arrays {	
	
	public static void main(String[] args) {
		
		int[] a= {10,20,30,40,50};
		//       a[0]
		char[] c = {'A','B','C','D','E'};
		String[] states = {"AP","TN","TS","KA"};
		
		System.out.println(a.length); // 0- 4 = 5 elements
		System.out.println(c.length); // 0-4 = 5 Elements
		System.out.println(states.length); // 0-3 - 4 elemnts
		
		System.out.println(a[0]);
		System.out.println("-----Print----");
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i] == 40 ) {
			   System.out.println(a[i]);
			}			
		}
        for(int i=0;i<c.length;i++) {
				
			   System.out.println(c[i]);
					
		}
        for(int i=0;i<states.length;i++) {
			
			   System.out.println(states[i]);
					
		}
	}

}


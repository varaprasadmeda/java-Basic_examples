package com.java;

public class HashCodeMeth {

	int i;

	HashCodeMeth(int i) {
		this.i = i;
	}

	public int hashCode() {
		return i;
	}

	public static void main(String args[]) {
		HashCodeMeth t1 = new HashCodeMeth(10);
		HashCodeMeth t2 = new HashCodeMeth(100);
		System.out.println(t1); // Test@a
		System.out.println(t1); // Test@2a4b2a

	}

}

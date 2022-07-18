package com.java.second;

public class OverrloadingExample {

	public void m1() {
		System.out.println("M1 method");
	}

	public void m1(int a) {
		System.out.println("M1 method " + a);
	}

	public void m1(int a, String name) {
		System.out.println("M1 method " + a);
		System.out.println("M1 method " + name);
	}

	public static void main(String[] args) {
		OverrloadingExample overrload = new OverrloadingExample();

		overrload.m1();
		overrload.m1(10);
		overrload.m1(10,"Veera");

	}
}

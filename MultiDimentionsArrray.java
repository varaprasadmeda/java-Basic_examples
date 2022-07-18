package com.java;

public class MultiDimentionsArrray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Multi dimentional Arrays */

		// int[][] a = {{100,300,500},{300,400,900}};
		int[][] a = new int[3][3];
		a[0][0] = 100;
		a[0][1] = 300;
		a[0][2] = 500;

		a[1][0] = 300;
		a[1][1] = 400;
		a[1][2] = 900;

		System.out.println(a[0][0]); // 100
		System.out.println(a[0][1]); // 300
		System.out.println(a[0][2]); // 500

		System.out.println(a[1][0]); // 300
		System.out.println(a[1][1]); // 400
		System.out.println(a[1][2]); // 900

		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				temp = temp + a[i][j];
				// System.out.println(a[i][j]);
			}
		}
		System.out.println(temp);
	}
}

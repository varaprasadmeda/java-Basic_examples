package com.java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerilizableDemo {

	public static void main(String[] args) {
		StudentExample s1 = new StudentExample(200, "Aruna");

		try {
			FileOutputStream fos = new FileOutputStream("F:\\Docs\\Sample.txt");

			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s1);
			oos.flush();
			oos.close();
			System.out.println("Successfully written the data");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

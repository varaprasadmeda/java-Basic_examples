package com.java;

public class Car {
	
	int wheels = 4;
	String carName = "Skoda";
	String carColor = "Blue";
	
	public void driving() {
		System.out.println("Super Driving");
	}

	public static void main(String[] args) {
		Car car= new Car();
		car.driving();
	}
	
}

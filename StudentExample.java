package com.java;

import java.io.Serializable;

public class StudentExample implements Serializable {

	
	int id;
	String name;

	public StudentExample(int id, String name) {
		this.id = id;
		this.name = name;
	}

}

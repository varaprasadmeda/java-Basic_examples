package com.java;

public class Student implements Cloneable {
	int rollNo;
	String name;
	String address;
	
	Student(){
		
	}

	Student(int rollNo, String name, String address) {
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

	public static void main(String[] args) {

		Student st = new Student(100, "Prakash", "Chennai");
		System.out.println(st.hashCode());

		try {
			Student cloneObject = (Student) st.clone();
			System.out.println(cloneObject.hashCode());
			
			System.out.println(st.rollNo+" "+st.name+" "+st.address);
			System.out.println(cloneObject.rollNo+" "+cloneObject.name+" "+cloneObject.address);
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

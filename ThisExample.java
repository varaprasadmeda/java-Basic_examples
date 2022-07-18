package com.java.second;

public class ThisExample {

	int empid;
	String empName;
	float salary;

	ThisExample(int empid, String empName, float salary) {
		this.empid = empid;
		this.empName = empName;
		this.salary = salary;

	}
	
	public void display() {
		System.out.println(empid+" "+empName+" "+salary);
	}

	public static void main(String[] args) {
		
		ThisExample example1 = new ThisExample(1001,"Varaprasad", 1000f);
		ThisExample example2 = new ThisExample(1002,"prasad", 2000f);
		
		example1.display();
		example2.display();

	}

}

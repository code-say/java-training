package com.cg.junit.student;

public class Student {
	int rollno;
	String firstName;
	String lastName;
	
	public Student(int rollno, String firstName, String lastName) {
		super();
		this.rollno = rollno;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getRollno() {
		return rollno;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	
}

package com.cg.junit.student;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StudentTest {

	@Test
	public void testRollNo() {
		Student stu=new Student(100,"Sam","D");
		assertEquals(stu.getRollno(), 100);
	}
	
	@Test
	public void testFirstName() {
		Student stu=new Student(100,"Sam","D");
		assertEquals(stu.getFirstName(), "Sam");
	}
	
	@Test
	public void testLastName() {
		Student stu=new Student(100,"Sam","D");
		assertEquals(stu.getLastName(), "D");
	}
	

}

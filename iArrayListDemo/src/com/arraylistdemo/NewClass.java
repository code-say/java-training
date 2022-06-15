//Adding userdefined data type to the collection
package com.arraylistdemo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

class Students 
{
	public int rollno;
	public String name;
	public double marks;
	
	public Students(int rollno, String name, double marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	
	
}

public class NewClass {

	public static void main(String args[])
	{
		ArrayList<Students> as = new ArrayList<Students>();
		
		Students s1 = new Students(1,"Code", 100);
		
		Students s2 = new Students(2,"JAVA",400);
		Students s3 = new Students(3,"sam",78.95);
		
		as.add(s1);
		as.add(s2);
		as.add(s3);
		
		Iterator it = as.iterator();
		
		
		
		while(it.hasNext())
		{
			Students s = (Students)it.next();
			System.out.println(s.getMarks());
			System.out.println(s.getRollno());
		}
	}
}

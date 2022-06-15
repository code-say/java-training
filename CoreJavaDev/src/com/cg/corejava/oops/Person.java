package com.cg.corejava.oops;

public class Person {
	
	int age=18;
	String name="Ravi";
	String address="Bangalore";
	
	public void display()
	{
		System.out.println("Person Name :"+name);
		System.out.println("Person age :"+age);
		System.out.println("Address :"+address);
	}

	public static void main(String[] args) {
		
		Person p2 = new Person();
		p2.display();
	}

}

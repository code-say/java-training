package com.cg.corejava.innerclasses;

interface Person {
	public void eat();
}

public class PersonImp1 {
	
	public static void main(String[] args) {
		
		// Person p1=new Person();
		// Annonymous Inner Class
		
		Person p1 = new Person() {
			public void eat() {
				System.out.println("Rich Food");
			}
		};
		p1.eat();
	}
}

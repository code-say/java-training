package com.cg.java8.lamda;

interface Person1 {
	public void eat();
}
public class Lambda1Prog implements Person1{

	public void eat()
	{
		System.out.println("Eat Fruites");
	}
	
	public static void main(String [] args) {
		Lambda1Prog p1 = new Lambda1Prog();
		p1.eat();
	}
}

package com.cg.java8.lamda;

interface Person4 {
	public void eat(String foodName);
}
public class Lamda4Prog {

	public static void main(String[] args) {
		
		Person4 p4 = (foodName) -> {
			{
				System.out.println("Eat Fruites :"+foodName);
			}
		};
		p4.eat("Milk");
	}
}

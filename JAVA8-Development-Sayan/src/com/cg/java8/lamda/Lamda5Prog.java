package com.cg.java8.lamda;

interface Person6 {
	public void eat(String foodName1,String foodName2);
}
public class Lamda5Prog {

	public static void main(String[] args) {
		
		Person6 p5 = (foodName1,foodName2) -> {
			{
				System.out.println("Eat Fruites and Drinks :"+foodName1+" with "+foodName2);
			}
		};
		p5.eat("Milk", "sugar");
	}
}

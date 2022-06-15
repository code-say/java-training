package com.cg.java8.lamda;

//Lamda Expression

// () : body
// -> Arrow Token

 interface Person3{
	public void eat();
}

public class Lambda3Prog {

	public static void main(String[] args) {
		
		Person3 p3= () -> {
			{
				System.out.println("Eat Fruites");
			}
		};
		p3.eat();
	}
}

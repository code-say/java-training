package com.cg.java8.lamda;

//annonymous Inner Class
 interface Per{
	public void eat();
}

public class Lambda2Prog {

	public static void main(String[] args) {
		
		Per p3= new Per(){
			public void eat() 
			{
				System.out.println("Eat Fruites");
			}
		};
		p3.eat();
	}
}

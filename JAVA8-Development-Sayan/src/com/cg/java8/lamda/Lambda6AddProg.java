package com.cg.java8.lamda;

interface Addition {
	public int addition(int a, int b);
}
public class Lambda6AddProg {

	public static void main(String[] args) {
		
		Addition add=(x,y) -> {
			int sum=x+y;
			return sum;
		};
		
		System.out.println("Sum :"+add.addition(2, 5));
	}
}

package com.cg.java8.lamda;

interface Add {
	public abstract int addition(int a,int b);
}
public class Lambda7AddProg {

	public static void main(String[] args) {
		Add add=(x,y) ->
		{
			int sum=x+y;
			return sum;
		};
		
		System.out.println("Sum :"+add.addition(2, 5));
	}
}

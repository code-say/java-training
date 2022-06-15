package com.cg.corejava.oops;

public class Calculation {

	
	int a=10,b=5,c; //attributes
	
	public void addition() //methods
	{
		c=a+b;
		System.out.println("Addition :" +c);
	}
	
	public void sub() //methods
	{
		c=a-b;
		System.out.println("sub :" +c);
	}
	
	public void multi() //methods
	{
		c=a*b;
		System.out.println("multi :" +c);
	}
	
	public void div() //methods
	{
		c=a/b;
		System.out.println("div :" +c);
	}
	
	public static void main(String[] args) {
		
		Calculation call = new Calculation();
		call.addition();
		call.sub();
		call.multi();
		call.div();
		
	}

}

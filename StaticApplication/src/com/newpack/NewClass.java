package com.newpack;

public class NewClass {

	static
	{
		System.out.println("Hello from static block and iam executed before main");
	}
	
	public static void main(String args[])
	{
		System.out.println("Hello from Main");
	}
}

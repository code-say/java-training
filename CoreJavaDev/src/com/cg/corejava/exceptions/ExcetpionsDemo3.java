package com.cg.corejava.exceptions;

public class ExcetpionsDemo3 {
	
	String name="null";
	public void myData() {
		
		try {
		System.out.println("One ");
		 
		System.out.println(name.length());
		
		int d=10/2;
		System.out.println(d);
		
		
		System.out.println("End..");
		}
		catch(NullPointerException e) {
			System.out.println("I can handle :"+e);
		}
		catch(ArithmeticException e) {
			System.out.println("I can handle :"+e);
		}
		
	}

	public static void main(String[] args) {
		
		ExcetpionsDemo3 ed=new ExcetpionsDemo3();
		ed.myData();
	}

}

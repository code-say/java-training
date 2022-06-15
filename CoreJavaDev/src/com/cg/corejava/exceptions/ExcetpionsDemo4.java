package com.cg.corejava.exceptions;

public class ExcetpionsDemo4 {
	
	String name="null";
	public void myData() {
		//open db connection 
		try {
		System.out.println("One ");
		 
		System.out.println(name.length());
		
		int d=10/0;
		System.out.println(d);
		
		
		System.out.println("End..");
		}
		catch(NullPointerException e) {
			System.out.println("I can handle :"+e);
		}
		catch(ArithmeticException e) {
			System.out.println("I can handle :"+e);
		}
		catch(Exception e) {
			System.out.println("I can handle :"+e);
		}
		finally {
			System.out.println("Finally block for Closing connection ");
		}
		
	}

	public static void main(String[] args) {
		
		ExcetpionsDemo4 ed=new ExcetpionsDemo4();
		ed.myData();
	}

}

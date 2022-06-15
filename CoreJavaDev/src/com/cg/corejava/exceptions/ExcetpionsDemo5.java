package com.cg.corejava.exceptions;

public class ExcetpionsDemo5 {
	
	String name="null";
	public void myData() throws Exception
	{
			
		System.out.println("One ");
		 System.out.println(name.length());
		
		int d=10/2;
		System.out.println(d);		
		System.out.println("End.."); 	
		
	}

	public static void main(String[] args) {
		try {
		ExcetpionsDemo5 ed=new ExcetpionsDemo5();
		ed.myData();
		
		}
		catch(Exception e) {
			System.out.println("I can handle :"+e);
		}
	}

}

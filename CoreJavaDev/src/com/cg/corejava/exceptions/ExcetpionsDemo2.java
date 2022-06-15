package com.cg.corejava.exceptions;

public class ExcetpionsDemo2 {
	
	String name="null";
	public void myData() {
		
		try {
		System.out.println("One ");
		 
		System.out.println(name.length());
		
		System.out.println("End..");
		}
		catch(NullPointerException e) {
			System.out.println("I can handle :"+e);
		}
		
	}

	public static void main(String[] args) {
		
		ExcetpionsDemo2 ed=new ExcetpionsDemo2();
		ed.myData();
	}

}

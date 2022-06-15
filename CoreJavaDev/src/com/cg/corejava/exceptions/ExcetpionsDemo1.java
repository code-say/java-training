package com.cg.corejava.exceptions;

public class ExcetpionsDemo1 {
	
	String name=null;
	public void myData() {
		System.out.println("One ");
		 
		System.out.println(name.length());
		
		System.out.println("End..");
		
	}

	public static void main(String[] args) {
		
		ExcetpionsDemo1 ed=new ExcetpionsDemo1();
		ed.myData();
	}

}

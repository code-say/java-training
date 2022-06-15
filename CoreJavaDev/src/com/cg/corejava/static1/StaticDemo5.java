package com.cg.corejava.static1;

//Non-Static methods can call static variables and static methods 

public class StaticDemo5 {
	static String countryName="India"; //static variable
	String name="Ram"; //non-static variable
	
	static public void myData() //static method
	{
		System.out.println("CountryName :"+countryName);
	}
	
	public void show() //non-static method
	{
		myData();
		System.out.println("Name :"+name);
	}
	public static void main(String[] args) {
		
		StaticDemo5 sd = new StaticDemo5();
		sd.show();
	}

}

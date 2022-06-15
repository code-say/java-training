package com.cg.corejava.static1;

public class StaticDemo6 {

	static String countryName="India";
	
	static {
		System.out.println("Static Block (Database Connection , Net work Connection)");
	}
	
	static public void myData()
	{
		System.out.println("My CountryName :"+countryName);
	}
	public static void main(String[] args) {
		StaticDemo6.myData();
		System.out.println(StaticDemo6.countryName);

	}

}

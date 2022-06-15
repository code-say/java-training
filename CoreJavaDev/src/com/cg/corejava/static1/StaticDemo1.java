package com.cg.corejava.static1;

public class StaticDemo1 {
	
	static String countryName="India";
	
	static public void myData() {
		System.out.println("My CountryName :"+countryName);
	}
	
	public static void main(String[] args) {
		
		StaticDemo1.myData();
		System.out.println(StaticDemo1.countryName);

	}

}

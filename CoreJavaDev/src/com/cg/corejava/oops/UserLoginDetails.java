package com.cg.corejava.oops;

public class UserLoginDetails {
	//overloading
	
	public void userLogin(String uname,String pass) {
		System.out.println("Username" + uname);
		System.out.println("Password :"+pass);
	}
	
	public void userLogin(int mobile,String pass)
	{
		System.out.println("MobileNo :"+mobile);
		System.out.println("Password :"+pass);
	}
	
	public void userLogin(String uname,String pass,String capcha)
	{
		System.out.println("Username :"+uname);
		System.out.println("Password :"+pass);
		System.out.println("Capcha :"+capcha);
	}
	public static void main(String[] args) {
		
		UserLoginDetails user = new UserLoginDetails();
		user.userLogin("Ramesh", "Ramesh123");
		user.userLogin(99999, "raju");
		user.userLogin("Krishna", "Krishna123", "Laptop");
	}

}

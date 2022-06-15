package com.capg.sayan.email.application4;
import java.util.*;
import java.io.*;
public class Email {

	public Scanner s = new Scanner(System.in); //Scanner class
	//setting variables as private to not give access directly
	private String fname;
	private String lname;
	private String dept;
	private String email;
	private String password;
	private int mailCapacity = 500;
	private String alter_email;
	
	//Constructor to receive first name , last name
	public Email(String fname,String lname) {
		this.fname = fname;
		this.lname = lname;
		System.out.println("New Employee:"+this.fname+""+this.lname);
		
	}
	
	private String generate_email()
	{
		return this.fname.toLowerCase()+"."+this.lname.toLowerCase()+"@"+this.dept.toLowerCase()+".company.com";
	}
	//Asking for dept
	private String setDept()
	{
		System.out.println("Deparment codes \n1 for Sales \n2 for Development \n3 for Accounting \n0 for None ");
		boolean flag = false;
		do {
			System.out.println("Enter Deparment Code");
			int choice = s.nextInt();
			switch(choice) {
			case 1:
				return "Sales";
			case 2:
				return "Development";
			case 3:
				return "Accounting";
			case 0:
				return "None";
			default:
				System.out.println("Invalid choice please choose it again");
			}
		}while (!flag);
		return null;
		}
	
	private String generate_password(int length) {
		Random r=new Random();
		String Capital_chars="ABCDEFGHIJKJMNOPQRSTUVWXYZ";
		String Small_chars="abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String symbols="!@#$%&?";
		String values=Capital_chars+Small_chars+numbers+symbols;
		String password="";
		for(int i=0; i<length;i++) {
			password = password+values.charAt(r.nextInt(values.length()));
		}
		return password;
	}
}

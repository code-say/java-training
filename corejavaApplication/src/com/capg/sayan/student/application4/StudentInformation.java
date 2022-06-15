package com.capg.sayan.student.application4;
import static  com.capg.ram.bank.application3.BankRBI.*;
public class StudentInformation extends BankAccountDetails implements StudentInteface{
	int stuno;int rollno;String address;
	
	//EmployeeInterface methods
	public void studentInfo(int stuno,int rollno) throws Exception 
	{
		this.stuno=stuno;
		this.rollno=rollno;
	}
	public void studentAddress(String address) throws Exception 
	{
		this.address=address;
	}
	public void studentDetais() throws Exception
	{
		System.out.println("Student no :"+stuno);
		System.out.println("Student address :"+address);
		System.out.println("Student rollno :"+rollno);
		System.out.println("Student Country:"+country);
	}
	
		// abstract class method
	public void accountDetails() throws Exception
	{
		System.out.println("This is my Account Serial :12345678");
		System.out.println("Branch Saltlake");
	}
	
	// local method
	public void show() throws Exception 
	{
		System.out.println("Sub class  method");
	}

	public static void main(String[] args) {
		try {
       
		StudentInformation stu=new StudentInformation();
		// abstract class 
		stu.accountDetails();
		stu.bankDetails();
		//interface methods
		stu.studentInfo(100,1073);
		stu.studentAddress("Kolkata");
		stu.studentDetais();
		//sub class method
		stu.show(); 
		
		//Bank RBI Class
				
		BankRBI bank=new BankRBI();  
		
		BankRBI bank1=new BankRBI(2,2);
		
		BankRBI.getBankDetails();
		//getBankDetails();
		
		} //try close
		catch(Exception e)
		{
			System.out.println("I can handle exception :"+e);
		}
		
		
		
	}
	@Override
	public void studentAddress() throws Exception {
		// TODO Auto-generated method stub
		
	}

}

package com.capg.sayan.student.application4;

public class BankRBI {
	
	static {
		System.out.println("Welcome to Student Details..");
     	}
    BankRBI()
    {
    	System.out.println("Education Bank Education Loan Details");
    }
    
    BankRBI(double p,double r)
    {
    	System.out.println(p*r/100);
    }
    
    public final static void getBankDetails() throws Exception 
    {
    	//System.out.println("Home Loan in 8%");
    	System.out.println("Education Loan in 10%");
    }
}

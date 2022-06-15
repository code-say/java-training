package com.capg.sayan.application2;


import java.io.IOException;
import java.util.Scanner;

public class JavaTrainingCenter {

	enum module1 {A,B,C,D};
	enum submodule1 {F,G,H};// Java Training Center {Address, Area, ExtraCurriculum}
	enum submodule2  {I,J}; //Fees Structure {Fees, ExtraFees}
	enum submodule3  {K,M}; // Student{Name, Area}
	enum menucode  {Y,N}; //Choice
	
	//static int menuitemcost;
	static int donation=100000;
	//static int guest;
	//static int amountdisc;
	//static int additionalitemcosAreat;
	
	public static void main(String[] args) throws IOException {
		  String module = null;
		/*InputStreamReader inp = new InputStreamReader(System.in); 
	    BufferedReader br = new BufferedReader(inp);*/
		  Scanner br =new Scanner(System.in);
	    
	    System.out.println("\n\t\t \t\t Welcome To JAVA TRAINING CENTER");
	    
		while(true)
		{
	
	  
		System.out.println("======================");
		System.out.println(" JTC Main Menu");
		System.out.println("======================");
		System.out.println("A-About Center");
		System.out.println("B-How to take Admission");
		System.out.println("C-Fees System");
		System.out.println("D-Quit");
		System.out.println("======================");
	    System.out.println("Enter your Choice(A,B,C,D) : ");


module=br.nextLine();

System.out.println("You entered choice is  : " );   

switch(module1.valueOf(module))
{

case A:
	
System.out.println(" About Training Center");
System.out.println("======================");
System.out.println("F-Address");
System.out.println("S-Area");
System.out.println("M-Extra Curriculum");
System.out.println("======================");
System.out.println("Enter your Module code (F,G,H) : ");

	module=br.nextLine();
switch(submodule1.valueOf(module))
{

case F:
	
	
	System.out.println("Saltlake,Kolkata ");
	break;
case G:
	System.out.println("Near TCS Office");
	break;
case H:
	System.out.println("Competitive Programming, Coding Contest with Prizepool, Quiz Contest");
	break;
}
break;
	
case B:
	
	System.out.println("Want to take Admission(Y/N)");
	System.out.println("Your entered choice is : ");
	
	module=br.nextLine();
	
	
	switch(menucode.valueOf(module))
	{

	case Y:
		System.out.println("Continue..........");;
		break;
	case N:
		System.out.println("Quit Module");
		System.exit(0);
		break;
	}
	break;
	
	
case C:
	System.out.println("Your entered choice is :");
	System.out.println("Fees System as Follow");
	System.out.println("Donation="+donation);
	System.out.println("Beginner => 20,000 /-");
	System.out.println("Advanced => 45,000 /-");
	System.out.println("======================");
	
	break;
	

case D:
	System.out.println("Quit");
	System.exit(0);
	break;
		
		}
		

		
		}
	}

}

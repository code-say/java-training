package com.cg.markscalculate;

import java.util.Scanner;

public class StudentMainController {

	public static void main(String[] args) throws Exception {
		
		int studentId=0;
	    String sub=null;
	    double marks;
	    
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Student Id :");
	    studentId=sc.nextInt();
	    
	    System.out.println("Enter Subject name");
	    sub=sc.next();
	    System.out.println("Enter marks :");
	    marks=sc.nextDouble();
	    
	    
	    StudentService studentService=new StudentService();
	    
	  int r=  studentService.addBookService(studentId, sub, marks);
	  
	  System.out.println("Main Controller last return Value from Dao :"+r);
	    
		

	}

}

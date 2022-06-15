package com.cg.corejava.constructors;

public class Employee3 {
	
		
	int eno;
	String ename;
	double sal;
	
	Employee3() {
		System.out.println("Default Constructor");
	}
	
	Employee3(int enol,String ename1,double sal1){
		eno=enol;
		ename=ename1;
		sal=sal1;
	}
	
	public void dispaly() {
		System.out.println("Employee No :"+eno);
		System.out.println("Employee Name :"+ename);
		System.out.println("Employee Sal :"+sal);
	}
	
	public static void main(String[] args) {	
		
		new Employee3();
		Employee3 emp3 = new Employee3(100, "Ravi", 55000);
		emp3.dispaly();
	}

}

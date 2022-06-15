package com.cg.corejava.interface1;

public class EmployeeImp1 implements EmployeeDetails,EmployeeHealthDetails{

	@Override
	public void employeeInfo() {
		System.out.println("Pune");
		System.out.println("JavaDeveloper");
	}
	
	@Override
	public void empHealthDetails() {
		System.out.println("His health Condition Good");
	}
	
	public void myData() {
		System.out.println("Local Data");
	}
	public static void main(String[] args) {
		
		EmployeeImp1 emp=new EmployeeImp1();
		emp.empHealthDetails();
		emp.employeeInfo();
		emp.myData(); //how we craete local method - by creating obeject of that class
		
	}	

}

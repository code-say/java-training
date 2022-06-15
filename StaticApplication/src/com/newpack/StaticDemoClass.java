//program to display the details of the employees of a company
package com.newpack;

class Employee
{
	String ename;
	int eid;
	//double salary;
	//String designation;
	static String company ="Capgemini";
	
	Employee(String ename,int eid)
	{
		this.ename = ename;
		this.eid = eid;
	}
	
	public void display() {
		System.out.println("The name of the employee :"+ename+" "+"The id =:"+eid+" "+"The Company :"+company );
	}
}

public class StaticDemoClass {

	public static void main(String[] args) {
		Employee e1 = new Employee("Sqayan",1);
		e1.display();
		
		Employee e2 = new Employee("Anu",2);
		e2.display();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

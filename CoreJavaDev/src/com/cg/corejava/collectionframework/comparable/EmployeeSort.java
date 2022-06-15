package com.cg.corejava.collectionframework.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeSort {

	public static void main(String[] args) {
		ArrayList<Employee> empList=new ArrayList<Employee>();
		
		empList.add(new Employee(10,"Mohan",23,55000));
		empList.add(new Employee(106, "Raju",27,75000));
		empList.add(new Employee(1,"Anu",21,95000));
		
		System.out.println("Before Sort");
		for(Employee emp:empList)
			System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getAge()+" "+emp.getSalary());
		
		Collections.sort(empList);
		
		System.out.println("\nAfter Sort");
		for(Employee emp:empList)
			System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getAge()+" "+emp.getSalary());
	}
}

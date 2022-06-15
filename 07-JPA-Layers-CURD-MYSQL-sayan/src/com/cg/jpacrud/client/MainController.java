package com.cg.jpacrud.client;

import com.cg.jpacrud.entities.Student;
import java.util.*;

import com.cg.jpacrud.service.StudentService;
import com.cg.jpacrud.service.StudentServiceImpl;

public class MainController {

	public static void main(String[] args) {

		//Debug this program as Debug -> Debug as Java Application
		
		StudentService service = new StudentServiceImpl();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student name");
		String name=sc.nextLine();
		
		Student student = new Student();
		    student.setStudentId(1);
		    student.setName(name);
	    service.addStudent(student);
		
		//at this breakpoint, we have added one record to table
		student = service.findStudentById(1);
		
		System.out.print("ID:"+student.getStudentId());
		System.out.println(" Name:"+student.getName());
		
		System.out.println("update Student Name");
		String name1= sc.nextLine();
		student.setName(name1);
		
		service.updateStudent(student);
		
		//at this breakpoint, we have updated record added in first section
		student = service.findStudentById(1);
		System.out.print("ID:"+student.getStudentId());
		System.out.println(" Name:"+student.getName());
		
		//at this breakpoint, record is removed from table
		//service.removeStudent(student);
		System.out.println("End of program...");
		
		
		

	}
}

package com.sayan.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.sayan.entity.Employee;

public class App {

	public static void main(String[] args) {
			
		
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Jpa-crud_example");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	Employee employee = new Employee();
	employee.setEno(1);
	employee.setName("sayan");
	employee.setSalary(20000d);
	
	//persisting employee object
	entityManager.getTransaction().begin();
	entityManager.persist(employee);
	entityManager.getTransaction().commit();
	
	
	
	entityManager.close();
	entityManagerFactory.close();
	}

}

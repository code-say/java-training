package com.sayan.student.dal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sayan.student.dal.entities.Student;
import com.sayan.student.dal.repos.StudentRepository;

@SpringBootTest
class StudentdalApplicationTests {

	@Autowired
	private StudentRepository repo;
	
	/*
	@Test
	void testCreateStudent() {

		Student student = new Student();
		student.setName("kewal");
		student.setCourse("jenkin");
		student.setFee(25d);
		repo.save(student);
	}
	*/
	@Test
	void testFindStudentById()
	{
		Student student = repo.findById(5L).get();
		System.out.println(student);
	}
	
	@Test
	void testUpdateStudent()
	{
		Student student = repo.findById(5L).get();
		student.setName("Yash");
		student.setCourse("Core Java");
		student.setFee(10d);
		repo.save(student);
	}
	
	/*
	@Test
	void testDeleteStudent()
	{
		Student student = repo.findById(1L).get();
		repo.delete(student);
	}
	*/

}

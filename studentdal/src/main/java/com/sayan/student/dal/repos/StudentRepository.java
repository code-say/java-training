package com.sayan.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.sayan.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}

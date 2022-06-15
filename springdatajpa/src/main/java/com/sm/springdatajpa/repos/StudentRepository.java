package com.sm.springdatajpa.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sm.springdatajpa.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}

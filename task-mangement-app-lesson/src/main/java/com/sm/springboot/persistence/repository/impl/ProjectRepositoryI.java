package com.sm.springboot.persistence.repository.impl;

import java.util.Optional;

import com.sm.springboot.persistence.model.Project;

public interface ProjectRepositoryI {

	Optional<Project> findById(Long id);
	
	Project save(Project project);
}

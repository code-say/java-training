package com.sm.springboot.persistence.repository.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

import com.sm.springboot.persistence.model.Project;

public class ProjectRepositoryImpl implements ProjectRepositoryI{

	List<Project> projects = new ArrayList<>();
	
	@Override
	public Optional<Project> findById(Long id) {
		return projects.stream().filter(p -> p.getId() == id).findFirst();
	}

	@Override
	public Project save(Project project) {
		return null;
	}

}

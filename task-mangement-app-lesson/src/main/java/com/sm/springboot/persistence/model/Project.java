package com.sm.springboot.persistence.model;

import java.time.LocalDate;

public class Project {
	
	private Long id;
	private String name;
	private LocalDate dateCreated;
	
	public Project(Long id, String name, LocalDate dateCreated) {
		super();
		this.id = id;
		this.name = name;
		this.dateCreated = dateCreated;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(LocalDate dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	

}

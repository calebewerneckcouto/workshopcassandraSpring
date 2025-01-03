package com.devsuperior.workshopcassandra.model.dto;

import java.util.UUID;

import com.devsuperior.workshopcassandra.model.entities.Departament;

public class DepartamentDTO {

	private UUID id;
	private String name;
	
	public DepartamentDTO() {
	
	}

	public DepartamentDTO(UUID id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	public DepartamentDTO(Departament entity) {
		super();
		this.id = entity.getId();
		this.name = entity.getName();
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}

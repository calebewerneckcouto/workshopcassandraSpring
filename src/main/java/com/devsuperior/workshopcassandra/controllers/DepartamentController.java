package com.devsuperior.workshopcassandra.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.workshopcassandra.model.dto.DepartamentDTO;
import com.devsuperior.workshopcassandra.model.entities.Departament;
import com.devsuperior.workshopcassandra.services.DepartamentService;

@RestController
@RequestMapping(value = "/departments")
public class DepartamentController {
	@Autowired
	private DepartamentService service;
	
	@GetMapping
	public ResponseEntity<List<DepartamentDTO>>findAll(){
		List<DepartamentDTO> list = service.findAll();
		return ResponseEntity.ok(list);
	}
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<DepartamentDTO>findById(@PathVariable UUID id){
		DepartamentDTO entity = service.findById(id);
		return ResponseEntity.ok(entity);
	}

}

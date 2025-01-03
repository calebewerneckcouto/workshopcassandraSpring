package com.devsuperior.workshopcassandra.controllers;

import java.net.URI;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.devsuperior.workshopcassandra.model.dto.DepartamentDTO;
import com.devsuperior.workshopcassandra.model.entities.Departament;
import com.devsuperior.workshopcassandra.services.DepartamentService;

@RestController
@RequestMapping(value = "/departments")
public class DepartamentController {
	@Autowired
	private DepartamentService service;

	@GetMapping
	public ResponseEntity<List<DepartamentDTO>> findAll() {
		List<DepartamentDTO> list = service.findAll();
		return ResponseEntity.ok(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<DepartamentDTO> findById(@PathVariable UUID id) {
		DepartamentDTO entity = service.findById(id);
		return ResponseEntity.ok(entity);
	}

	@PostMapping
	public ResponseEntity<DepartamentDTO> insert(@RequestBody DepartamentDTO dto) {
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);

	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<DepartamentDTO> update(@PathVariable UUID id, @RequestBody DepartamentDTO dto) {
		dto = service.update(id,dto);
		return ResponseEntity.ok(dto);

	}

}

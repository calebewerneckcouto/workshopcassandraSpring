package com.devsuperior.workshopcassandra.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.workshopcassandra.model.dto.ProductDTO;
import com.devsuperior.workshopcassandra.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
	@Autowired
	private ProductService service;



	@GetMapping(value = "/{id}")
	public ResponseEntity<ProductDTO> findById(@PathVariable UUID id) {
		ProductDTO entity = service.findById(id);
		return ResponseEntity.ok(entity);
	}
	
	@GetMapping
	public ResponseEntity<List<ProductDTO>> findByDepartament(@RequestParam(name = "department",defaultValue = "") String departament) {
		List<ProductDTO> list = service.findByDepartment(departament);
		return ResponseEntity.ok(list);
	}
	
	
	
	@GetMapping(value = "/description")
	public ResponseEntity<List<ProductDTO>> findByDescription(@RequestParam(name = "text",defaultValue = "") String text) {
		List<ProductDTO> list = service.findByDescritption(text);
		return ResponseEntity.ok(list);
	}
	

	

}

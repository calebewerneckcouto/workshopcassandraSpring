package com.devsuperior.workshopcassandra.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.workshopcassandra.model.dto.DepartamentDTO;
import com.devsuperior.workshopcassandra.model.entities.Departament;
import com.devsuperior.workshopcassandra.repositories.DepartamentRepository;
import com.devsuperior.workshopcassandra.services.exceptions.ResourceNotFoundException;
@Service
public class DepartamentService {
	
	@Autowired
	private DepartamentRepository repository;
	
	public List<DepartamentDTO> findAll() {
		List<Departament> list = repository.findAll();
		return list.stream().map(x-> new DepartamentDTO(x)).collect(Collectors.toList());
	}
	
	
	public DepartamentDTO findById(UUID  id) {
		Optional<Departament> result = repository.findById(id);
		Departament entity = result.orElseThrow(()-> new ResourceNotFoundException("Id não encontrado"));
		return new DepartamentDTO(entity);
	}

}

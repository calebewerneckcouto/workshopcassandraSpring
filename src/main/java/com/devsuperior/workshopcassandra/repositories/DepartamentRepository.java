package com.devsuperior.workshopcassandra.repositories;

import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.devsuperior.workshopcassandra.model.entities.Departament;

public interface DepartamentRepository extends CassandraRepository<Departament,UUID> {

}

package com.devsuperior.workshopcassandra.model.entities;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.Frozen;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import com.devsuperior.workshopcassandra.model.embedded.Prop;

@Table(value = "products")
public class Product {
	@PrimaryKey
	private UUID id;
	private String departament;
	private Double price;
	private Instant moment;
	private String name;
	private String description;

	private List<@Frozen Prop> props = new ArrayList<Prop>();//exigencia do banco cassandra....@Frozen

	public Product() {

	}

	public Product(UUID id, String departament, Double price, Instant moment, String name, String description) {
		super();
		this.id = id;
		this.departament = departament;
		this.price = price;
		this.moment = moment;
		this.name = name;
		this.description = description;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getDepartament() {
		return departament;
	}

	public void setDepartament(String departament) {
		this.departament = departament;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Prop> getProps() {
		return props;
	}

}

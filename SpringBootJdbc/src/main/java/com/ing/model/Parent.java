package com.ing.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Parent {
	
	private String name;
	@Id
	@SequenceGenerator(name = "parent_seq", sequenceName = "PARENT_SEQUENCE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "parent_seq")
	private Long id;
	public Parent(String name) {
		super();
		this.name = name;
	}

}

package com.ing.model;


import jakarta.persistence.Column;
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
public class Student {
	
	public Student(String name, String level, String motherName, String fatherName) {
		super();
		this.name = name;
		this.level = level;
		this.motherName = motherName;
		this.fatherName = fatherName;
	}

	private String name;
	@Id
	@SequenceGenerator(name = "user_seq", sequenceName = "USER_SEQUENCE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
	private Long id;
	
	@Column(name = "Standard")
	private String level;
	
	@Column(name = "MOTHERNAME")
	private String motherName;
	
	@Column(name = "FATHERNAME")
	private String fatherName;
	

}

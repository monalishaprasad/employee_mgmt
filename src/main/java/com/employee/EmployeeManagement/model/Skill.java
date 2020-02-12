package com.employee.EmployeeManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "SKILL")
public class Skill {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "Id", unique = true, nullable = false)
	private long id;

	@Column(name = "SKILL_TYPE")
	private String skillType;

	@Column(name = "VERSION")
	private String version;

	@Column(name = "IS_CERTIFIED")
	private boolean isCertified;

}

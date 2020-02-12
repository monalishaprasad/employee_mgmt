package com.employee.EmployeeManagement.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "EMPLOYEE_INFO")

public class EmployeeInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "Id", unique = true, nullable = false)
	private long id;

	@Column(name = "FULL_NAME", nullable = false)
	private String fullName;
	
	@Column(name="EMP_NUMBER", nullable = false)
	private String empNumber;
	
	@JoinColumn(name= "EMPLOYEE_ID")
	@OneToMany(cascade = CascadeType.ALL)
	private List<Address> Addresses;
	
	@Column(name="CONTACT_NUMBER")
	private String contactNumber;
	
	@JoinColumn(name="EMPLOYEE_ID")
	@OneToMany(fetch= FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Skill> skills;
	
	@JoinColumn(name= "DEPARTMENT_ID")
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Department department;
	
}

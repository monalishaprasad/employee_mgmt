package com.employee.EmployeeManagement.dto;

import java.util.List;

import lombok.Data;

@Data
public class EmployeeInfoDTO {

	private long id;
	private String fullName;
	private String empNumber;
	private List<AddressDTO> address;
	private String contactNumber;
	private List<SkillDTO> skills;
	private DepartmentDTO department;
	
	
	
}

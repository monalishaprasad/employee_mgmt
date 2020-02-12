package com.employee.EmployeeManagement.dto;

import lombok.Data;

@Data
public class SkillDTO {

	private Long id;
	private String skillType;
	private String version;
	private boolean isCertified;
	
	}

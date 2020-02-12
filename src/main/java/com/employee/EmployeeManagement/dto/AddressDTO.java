package com.employee.EmployeeManagement.dto;

import lombok.Data;

@Data
public class AddressDTO {

	private Long Id;
	private String houseNumber;
	private String streetNumber;
	private String area;
	private String City;
	private String state;
	private Long pincode;
	
}

package com.employee.EmployeeManagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.EmployeeManagement.busisnessservice.EmployeeService;
import com.employee.EmployeeManagement.dto.EmployeeInfoDTO;

@RestController
@RequestMapping("employee")

public class EmployeeContoller {

	@Autowired
	private EmployeeService empService;
	
	@PostMapping
	public EmployeeInfoDTO postEmployee(@RequestBody EmployeeInfoDTO employeeInfoDTO ) {
		
		employeeInfoDTO = empService.postEmployee(employeeInfoDTO);
		
		return employeeInfoDTO;
	}
	
	
	@GetMapping
	public List<EmployeeInfoDTO> getEmployeeList(){
		
		List<EmployeeInfoDTO> listOfEmployees = empService.getEmployeeList();
		
		return listOfEmployees;
	}
	
	
	@GetMapping(path = "id/{id}")
	public EmployeeInfoDTO getEmployeeInfoById(@PathVariable("id") long id ) {
		
		EmployeeInfoDTO empInfo = empService.getEmployeeInfoById(id);
		return empInfo;
	}
}

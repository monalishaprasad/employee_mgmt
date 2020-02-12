package com.employee.EmployeeManagement.busisnessservice;

import java.util.List;

import com.employee.EmployeeManagement.dto.EmployeeInfoDTO;

public interface EmployeeService {

	EmployeeInfoDTO postEmployee(EmployeeInfoDTO employeeInfoDTO);

	List<EmployeeInfoDTO> getEmployeeList();

	EmployeeInfoDTO getEmployeeInfoById(long id);

}

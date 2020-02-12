package com.employee.EmployeeManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.EmployeeManagement.dto.EmployeeInfoDTO;
import com.employee.EmployeeManagement.model.EmployeeInfo;



public interface EmployeeRepository extends JpaRepository<EmployeeInfo, Long> {



	
}

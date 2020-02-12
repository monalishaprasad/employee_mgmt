package com.employee.EmployeeManagement.businessserviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.EmployeeManagement.busisnessservice.EmployeeService;
import com.employee.EmployeeManagement.dto.EmployeeInfoDTO;
import com.employee.EmployeeManagement.mapper.EmployeInfoMapper;
import com.employee.EmployeeManagement.model.EmployeeInfo;
import com.employee.EmployeeManagement.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepo;
	
	@Autowired
	private EmployeInfoMapper empMapper;

	@Override
	public EmployeeInfoDTO postEmployee(EmployeeInfoDTO employeeInfoDTO) {
		
		EmployeeInfo empInfo = empMapper.employeInfoDTOToEmployeInfo(employeeInfoDTO);
		
		empInfo = employeeRepo.save(empInfo);
		
		return empMapper.employeInfoToEmployeInfoDTO(empInfo);
	}

	@Override
	public List<EmployeeInfoDTO> getEmployeeList() {
		
		List<EmployeeInfo> empInfo = employeeRepo.findAll();
		
		return empMapper.employeInfoListToEmployeInfoDTOList(empInfo);
	}

	@Override
	public EmployeeInfoDTO getEmployeeInfoById(long id) {
		
		EmployeeInfo empInfo = employeeRepo.getOne(id);
		
		return empMapper.employeInfoToEmployeInfoDTO(empInfo);
	}
	
	

	
}

package com.employee.EmployeeManagement.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.mapstruct.Mapper;

import com.employee.EmployeeManagement.dto.DepartmentDTO;
import com.employee.EmployeeManagement.model.Department;

@Mapper
public interface DepartmentMapper {

	public Department departmentDTOToDepartment(DepartmentDTO departmentDto);

	public DepartmentDTO departmentToDepartmentDTO(Department department);

	public default List<DepartmentDTO> DepartmentListToDepartmentDtoList(List<Department> listOfDepartment) {

		return listOfDepartment.stream().map(d -> departmentToDepartmentDTO(d)).collect(Collectors.toList());
	}

	public default List<Department> DepartmentDTOToDepartment(List<DepartmentDTO> listOfDepartmentDto) {
		return listOfDepartmentDto.stream().map(d -> departmentDTOToDepartment(d)).collect(Collectors.toList());
	}

}

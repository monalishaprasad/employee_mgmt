package com.employee.EmployeeManagement.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.employee.EmployeeManagement.dto.AddressDTO;
import com.employee.EmployeeManagement.dto.DepartmentDTO;
import com.employee.EmployeeManagement.dto.EmployeeInfoDTO;
import com.employee.EmployeeManagement.dto.SkillDTO;
import com.employee.EmployeeManagement.model.Address;
import com.employee.EmployeeManagement.model.Department;
import com.employee.EmployeeManagement.model.EmployeeInfo;
import com.employee.EmployeeManagement.model.Skill;

@Component
public class EmployeInfoMapper {

	@Autowired
	private AddressMapper addressMapper;

	@Autowired
	private DepartmentMapper departmentMapper;

	@Autowired
	private SkillMapper skillMappper;

	public EmployeeInfoDTO employeInfoToEmployeInfoDTO(EmployeeInfo employeeInfo) {

		EmployeeInfoDTO employeeInfoDTO = new EmployeeInfoDTO();

		employeeInfoDTO.setId(employeeInfo.getId());
		employeeInfoDTO.setFullName(employeeInfo.getFullName());
		employeeInfoDTO.setContactNumber(employeeInfo.getContactNumber());
		employeeInfoDTO.setEmpNumber(employeeInfo.getEmpNumber());

		List<AddressDTO> addressDTO = addressMapper.AddressListToAddresssDTOList(employeeInfo.getAddresses());
		employeeInfoDTO.setAddress(addressDTO);
		DepartmentDTO deptDTO = departmentMapper.departmentToDepartmentDTO(employeeInfo.getDepartment());
		employeeInfoDTO.setDepartment(deptDTO);

		List<SkillDTO> skillDTO = skillMappper.listOfSkillToSkillDTO(employeeInfo.getSkills());
		employeeInfoDTO.setSkills(skillDTO);

		return employeeInfoDTO;
	}

	public EmployeeInfo employeInfoDTOToEmployeInfo(EmployeeInfoDTO employeeInfoDTO) {

		EmployeeInfo employeeInfo = new EmployeeInfo();

		employeeInfo.setId(employeeInfoDTO.getId());
		employeeInfo.setFullName(employeeInfoDTO.getFullName());
		employeeInfo.setContactNumber(employeeInfoDTO.getContactNumber());
		employeeInfo.setEmpNumber(employeeInfoDTO.getEmpNumber());

		List<Address> addresses = addressMapper.AddresssDTOListToAddressList(employeeInfoDTO.getAddress());
		employeeInfo.setAddresses(addresses);

		Department dept = departmentMapper.departmentDTOToDepartment(employeeInfoDTO.getDepartment());
		employeeInfo.setDepartment(dept);

		List<Skill> skill = skillMappper.ListOfSkillDTOToSkill(employeeInfoDTO.getSkills());
		employeeInfo.setSkills(skill);

		return employeeInfo;

	}

	public List<EmployeeInfoDTO> employeInfoListToEmployeInfoDTOList(List<EmployeeInfo> employeeInfoList) {

		// EmployeeInfoDTO employeeInfoDTO = new EmployeeInfoDTO();

		List<EmployeeInfoDTO> employeeInfoDTOList = new ArrayList<EmployeeInfoDTO>();

		for (EmployeeInfo empInfo : employeeInfoList) {

			EmployeeInfoDTO employeeInfoDTO = employeInfoToEmployeInfoDTO(empInfo);
			
			employeeInfoDTOList.add(employeeInfoDTO);

			/*
			 * employeeInfoDTO.setFullName(empInfo.getFullName());
			 * employeeInfoDTO.setContactNumber(empInfo.getContactNumber());
			 * employeeInfoDTO.setEmpNumber(empInfo.getEmpNumber()); List<AddressDTO>
			 * addressDTO =
			 * addressMapper.AddressListToAddresssDTOList(empInfo.getAddresses());
			 * employeeInfoDTO.setAddress(addressDTO); DepartmentDTO deptDTO =
			 * departmentMapper.departmentToDepartmentDTO(empInfo.getDepartment());
			 * employeeInfoDTO.setDepartment(deptDTO); List<SkillDTO> skillDTO =
			 * skillMappper.listOfSkillToSkillDTO(empInfo.getSkills());
			 * employeeInfoDTO.setSkills(skillDTO);
			 */

		}

		return employeeInfoDTOList;
	}

	public List<EmployeeInfo> employeInfoDtoListToEmployeInfoList(List<EmployeeInfoDTO> employeeInfoDtoList) {

		List<EmployeeInfo> employeeInfoList = new ArrayList<EmployeeInfo>();

		for (EmployeeInfoDTO empInfoDto : employeeInfoDtoList) {

			EmployeeInfo employeeInfo = employeInfoDTOToEmployeInfo(empInfoDto);

			employeeInfoList.add(employeeInfo);

			/*
			 * employeeInfo.setFullName(empInfoDto.getFullName());
			 * employeeInfo.setContactNumber(empInfoDto.getContactNumber());
			 * employeeInfo.setEmpNumber(empInfoDto.getEmpNumber());
			 * 
			 * List<Address> addresses =
			 * addressMapper.AddresssDTOListToAddressList(empInfoDto.getAddress());
			 * employeeInfo.setAddresses(addresses);
			 * 
			 * Department dept =
			 * departmentMapper.departmentDTOToDepartment(empInfoDto.getDepartment());
			 * employeeInfo.setDepartment(dept);
			 * 
			 * List<Skill> skill =
			 * skillMappper.ListOfSkillDTOToSkill(empInfoDto.getSkills());
			 * employeeInfo.setSkills(skill);
			 */

		}
		return employeeInfoList;
	}

}

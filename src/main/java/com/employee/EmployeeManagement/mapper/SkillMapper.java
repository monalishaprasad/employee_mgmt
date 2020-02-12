package com.employee.EmployeeManagement.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.mapstruct.Mapper;

import com.employee.EmployeeManagement.dto.SkillDTO;
import com.employee.EmployeeManagement.model.Skill;

@Mapper
public interface SkillMapper {

	public Skill skillDTOToSkill(SkillDTO skillDTO);
	
	public SkillDTO skillToSkillDTO(Skill skill);
	
	public default List<Skill> ListOfSkillDTOToSkill (List<SkillDTO> listofSkillDTO){
		return listofSkillDTO.stream().map(s -> skillDTOToSkill(s)).collect(Collectors.toList());
	}
	
	public default List<SkillDTO> listOfSkillToSkillDTO( List<Skill> listOfSkill){
		return listOfSkill.stream().map(s-> skillToSkillDTO(s)).collect(Collectors.toList());
				
	}
	}

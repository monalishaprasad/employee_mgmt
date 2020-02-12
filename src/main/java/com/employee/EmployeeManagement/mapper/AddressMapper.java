package com.employee.EmployeeManagement.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.mapstruct.Mapper;

import com.employee.EmployeeManagement.dto.AddressDTO;
import com.employee.EmployeeManagement.model.Address;

@Mapper
public interface AddressMapper {

	public Address addressDTOToAddress(AddressDTO addressDTO);

	public AddressDTO addressToAddressDTO(Address address);

	public default List<AddressDTO> AddressListToAddresssDTOList(List<Address> addresses) {
		return addresses.stream().map(a -> addressToAddressDTO(a)).collect(Collectors.toList());
	}

	default List<Address> AddresssDTOListToAddressList(List<AddressDTO> addresses) {
		return addresses.stream().map(a -> addressDTOToAddress(a)).collect(Collectors.toList());
	}
}

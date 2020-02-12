package com.employee.EmployeeManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "ADDRESS")
public class Address {

	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE )
	@Column(name="ID", unique= true,  nullable= false)
	private Long Id;
	
	@Column(name="HOUSE_NUMBER")
	private String houseNumber;
	
	@Column(name="STREET_NUMBER")
	private String streetNumber;
	
	@Column(name="Area")
	private String area;
	
	@Column(name="CITY")
	private String City;
	
	@Column(name="STATE")
	private String state;
	
	@Column(name="PINCODE")
	private Long pincode;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getPincode() {
		return pincode;
	}

	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	
	
	
	
	
	
}

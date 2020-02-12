package com.employee.EmployeeManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name ="SALARY")
public class Salary {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name ="ID", unique = true, nullable = false)
	private long id;
	
	@Column(name ="CTC")
	private double CTC;
	
	@Column(name = "BASIC_PAY")
	private double basicPay;
	
	@Column(name = "PF")
	private double Pf;
	
	@Column(name = "PT")
	private double Pt;
	
	@Column(name = "LUNCH_DEDUCTION")
	private double lunchDeduction;
	
	@Column(name = "IN_HAND")
	private double inHand;
}

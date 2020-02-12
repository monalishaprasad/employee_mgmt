package com.employee.EmployeeManagement.businessserviceimpl;

import java.util.Comparator;

public class Student implements Comparable, Comparator {

	private String name;
	private int rollNo;

	public Student() {
		super();
	}

	public Student(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public int compareTo(Object o) {

		System.out.println("compareTo Called");
		Student s = (Student) o;
		int i = (s.rollNo - this.rollNo);
		return i;
	}

	@Override
	public int compare(Object o1, Object o2) {
		
		
		return -1;
	}
	

}

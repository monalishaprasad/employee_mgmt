package com.employee.EmployeeManagement.businessserviceimpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Comparision {

	public static void main(String[] args) {

		Student s1 = new Student("A", 1);
		Student s2 = new Student("B", 2);
		Student s3 = new Student("C", 3);
		Student s4 = new Student("D", 4);
		Student s5 = new Student("E", 5);
		Student s6 = new Student("F", 6);
		Student s7 = new Student("G", 7);
		Student s8 = new Student("H", 8);

		List<Student> students = new ArrayList<>();

		students.add(s8);
		students.add(s1);
		students.add(s6);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s2);
		students.add(s7);


		Comparator<Student> studentCom = (Student sOne, Student sTwo) -> (sTwo.getRollNo() - sOne.getRollNo());
		Comparator<Student> studentComByName = (Student sOne,
				Student sTwo) -> (sOne.getName().compareTo(sTwo.getName()));
				
		Comparable<Student> comparable = (s) ->{
			return -1;
		};

//		Comparator<Student> studentCom2 = new Student();
		List<Student> stud = students.stream().sorted(studentComByName).collect(Collectors.toList());
		
		System.out.println(stud);
		

//		Comparator<Student> studentCom2 = new Student();
		List<Student> stud2 = students.stream().sorted(studentCom).collect(Collectors.toList());
		
		
		
		

		System.out.println(stud2);

	}

}

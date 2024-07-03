package com.java.demo2;

public class Employee {
	
	
	int empId;
	String name;
	String gender;
	
	
	public Employee(int empId, String name, String gender) {
		super();
		this.empId = empId;
		this.name = name;
		this.gender = gender;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

}

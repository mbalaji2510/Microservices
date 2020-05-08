package com.hexa.rating.catlog;

public class EmployeeList {
	
	private Iterable<Employee> empList;

	public EmployeeList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeList(Iterable<Employee> empList) {
		super();
		this.empList = empList;
	}

	public Iterable<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(Iterable<Employee> empList) {
		this.empList = empList;
	}
	

}

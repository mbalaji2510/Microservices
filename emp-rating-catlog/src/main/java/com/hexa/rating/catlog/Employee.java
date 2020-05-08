package com.hexa.rating.catlog;


public class Employee {
	
	
	private String id;
	private String name;
	private String salary;
	
	
	private Company company;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String id, String name, String salary,String companyId) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		company = new Company(companyId, "", "") ;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	

}

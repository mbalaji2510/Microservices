package com.hexa.rating.catlog;




public class Company {
	
	
	String id;
	String name;	
	String noofEmp;
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Company(String id, String name, String noofEmp) {
		super();
		this.id = id;
		this.name = name;
		this.noofEmp = noofEmp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNoofEmp() {
		return noofEmp;
	}
	public void setNoofEmp(String noofEmp) {
		this.noofEmp = noofEmp;
	}
	

}

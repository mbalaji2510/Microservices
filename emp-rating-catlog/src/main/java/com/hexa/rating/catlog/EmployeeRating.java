package com.hexa.rating.catlog;

public class EmployeeRating {
	
	private Employee emp ;
	private Rating rating;
	public EmployeeRating(Employee emp, Rating rating) {
		super();
		this.emp = emp;
		this.rating = rating;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public Rating getRating() {
		return rating;
	}
	public void setRating(Rating rating) {
		this.rating = rating;
	}
	public EmployeeRating() {
		super();
		// TODO Auto-generated constructor stub
	}

}

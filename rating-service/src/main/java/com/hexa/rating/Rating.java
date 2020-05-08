package com.hexa.rating;

public class Rating {
	
	private int rating;
	 private String empid;
	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public Rating(int rating, String empid) {
		super();
		this.rating = rating;
		this.empid = empid;
	}

}

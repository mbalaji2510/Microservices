package com.hexa.config.lobcok;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Component
public class EmployeeLombokEx {
	private String id;
	private String name;
	private String address;
	private String adharCard;
	public EmployeeLombokEx() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeLombokEx(String id, String name, String address, String adharCard) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.adharCard = adharCard;
	}
	

}

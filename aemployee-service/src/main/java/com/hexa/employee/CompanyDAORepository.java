package com.hexa.employee;

import org.springframework.data.repository.CrudRepository;

import com.hexa.employee.model.Company;

public interface CompanyDAORepository  extends CrudRepository<Company, String>{
	
	
}

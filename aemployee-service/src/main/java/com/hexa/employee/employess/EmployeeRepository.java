package com.hexa.employee.employess;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.hexa.employee.model.Employee;

public interface EmployeeRepository  extends CrudRepository<Employee ,String>{
	
	public List<Employee> findByCompanyId(String id);

}

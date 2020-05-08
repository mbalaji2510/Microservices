package com.hexa.employee.employess;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexa.employee.model.Employee;
import com.hexa.employee.model.EmployeeList;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public EmployeeList getAllEmployes( String companyId){
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeRepository.findByCompanyId(companyId).forEach(employeeList::add);
		//Testing 
		EmployeeList empList = new EmployeeList();
		empList.setEmpList(employeeList);
		return empList;
		//return Arrays.asList(new Employee("12", "Balaji", "10000"));
	}
	
	public Optional<Employee> getEmployee(String empId) {
		
		return employeeRepository.findById(empId);
	}
	
	public void addEmployee(Employee emp) {
		employeeRepository.save(emp);
	}
	
	public void updateEmployee(Employee emp) {
		employeeRepository.save(emp);
	}
	public void deleteEmp(String empId) {
		employeeRepository.deleteById(empId);
	}

}

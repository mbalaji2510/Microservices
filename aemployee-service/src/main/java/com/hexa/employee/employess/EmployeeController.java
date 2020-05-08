package com.hexa.employee.employess;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hexa.employee.CompanyService;
import com.hexa.employee.model.Company;
import com.hexa.employee.model.Employee;
import com.hexa.employee.model.EmployeeList;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	CompanyService companyService;
	
	@RequestMapping("/seeddata")
    //url : /companies/seeddata
    public String seeddata() {
        
        companyService.addCompany(new Company("Hexaware", "Hexaware India Pvt Ltd", "22000"));
        companyService.addCompany(new Company("Apple", "Apple India Pvt Ltd", "10000"));
        companyService.addCompany(new Company("Infosys", "Infosys India Pvt Ltd"," 5000"));
        
        employeeService.addEmployee(new Employee("Sajal", "Sajal from Hexaware", "1000000", "Hexaware"));
        employeeService.addEmployee(new Employee("Mayur", "Sajal always from Hexaware", "2000000", "Hexaware"));
        employeeService.addEmployee(new Employee("Swapil", "Sajal is also from Hexaware", "3000000", "Hexaware"));
        employeeService.addEmployee(new Employee("Rehman", "Rehman pillar of Hexaware", "4000000", "Hexaware"));
        employeeService.addEmployee(new Employee("Akash", "Akash Shah", "40000", "Apple"));
        employeeService.addEmployee(new Employee("Lucky", "Lakhvinder Singh", "1000", "Apple"));
        
        return "SeedData sucess";
	}
	@RequestMapping("/companies/{companyId}/employees") 
	public EmployeeList getAllEmployes(@PathVariable String companyId){
		try {
			
			Thread.sleep(1000);
			
		}
		catch(Exception e){
			System.out.println(e.toString());
			
		}
		return employeeService.getAllEmployes(companyId);
		//return Arrays.asList(new Employee("12", "Balaji", "10000"));
	}
	
	@RequestMapping("/companies/{companyId}/employees/{empid}") 
	//Optional<Employee>
	public Optional<Employee> getAllEmploye(@PathVariable String companyId,@PathVariable String empid){
		
		return employeeService.getEmployee(empid);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/companies/{companyId}/employees") 
	public void CreateEmp(@PathVariable String companyId,@RequestBody Employee emp){
		emp.setCompany(new Company(companyId,"",""));
		employeeService.addEmployee(emp);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/companies/{companyId}/employees/{empid}") 
	public void updateEmp(@PathVariable String companyId,@PathVariable String empid,@RequestBody Employee emp){
		
		employeeService.updateEmployee(emp);
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/companies/{companyId}/employees/{empid}") 
	public void DeleteEmp(@PathVariable String companyId,@PathVariable String empid){
		
		employeeService.deleteEmp(empid);
		
	}

}

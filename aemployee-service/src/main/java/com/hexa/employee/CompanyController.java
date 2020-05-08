package com.hexa.employee;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.hexa.employee.model.Company;

@RestController
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;
	//private CompanyDAORepository companyDao;
	
	@RequestMapping("/companies") 
	public Iterable<Company> getAllCompanies() {
		return companyService.getAllCompanies();
		
		//return companyService.getAllCompanies();
		/*return Arrays.asList(new Company("Hexa", "12", "2000"),
				new Company("cts", "12", "2000"),
				new Company("PPIC", "12", "2000"));*/
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/companies")
	public void addCompany(@RequestBody Company company) {
		companyService.addCompany(company);
	}
	
	@RequestMapping ("companies/{id}")
	public Optional<Company> getCompany(@PathVariable String id) {
		return companyService.getCompany(id);
	}

	@RequestMapping(method=RequestMethod.PUT, value="/companies/{id}")
	public void updateCompany(@RequestBody Company company, @PathVariable String id)  {
		
		companyService.updateCompany(id, company);
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/companies/{id}")
	public void updateCompany( @PathVariable String id)  {
		
		companyService.deleteCompany(id);
		
	}
		
}

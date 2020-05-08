package com.hexa.employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexa.employee.model.Company;

@Service
public class CompanyService {
	
	@Autowired
	private CompanyDAORepository companyDAORepository;
	
	public List<Company> getAllCompanies() {
		
		List<Company> companyList = new ArrayList<Company>();
		companyDAORepository.findAll().forEach(companyList::add);
		return companyList;
//		return Arrays.asList(new Company("Hexa", "12", "2000"),
//				new Company("cts", "12", "2000"),
//				new Company("PPIC", "12", "2000"));
		
	}
	
	public void addCompany(Company company) {
		companyDAORepository.save(company);
	}
	
	public void updateCompany(String id ,Company company) {
		companyDAORepository.save(company);
		
	}
	
	public void deleteCompany(String id) {
		
		companyDAORepository.deleteById(id);
		
	}
	
	public Optional<Company> getCompany(String id) {
		return companyDAORepository.findById(id);
		
		
	}

}

package com.hexa.rating.catlog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@RestController
public class EmpRatingCatlogController {
	
	@Autowired
	private RestTemplate restTemplate;
	@RequestMapping("/catalog/companies/{companyId}")
	@HystrixCommand(fallbackMethod = "fallbackEmployeeRating")
	public List<EmployeeRating> getEmpRatings(@PathVariable String companyId ) {
		
		
		Employee[] listData = restTemplate.getForObject("http://EMPLOYEES/companies/"+companyId+"/employees",Employee[].class);
		List<EmployeeRating> empRating = new ArrayList<EmployeeRating>();
		for (Employee employeeList : listData) {
			
			Rating rating = restTemplate.getForObject("http://RATING/rating/"+employeeList.getId(),Rating.class);
			EmployeeRating employeeRating = new EmployeeRating();
			employeeRating.setEmp(employeeList);
			employeeRating.setRating(rating);
			empRating.add(employeeRating);
		}
		//Iterable<Employee> itrEmp = listData.getEmpList();
		//Iterator<Employee> empdata = itrEmp.iterator();
		
		
		/*while(empdata.hasNext()) {
			Employee emp =  empdata.next();
			Rating rating = restTemplate.getForObject("http://RATING/rating/"+emp.getId(),Rating.class);
			EmployeeRating employeeRating = new EmployeeRating();
			employeeRating.setEmp(emp);
			employeeRating.setRating(rating);
			empRating.add(employeeRating);*/
			
			
		//}
		return empRating;
	

}
	
	public List<EmployeeRating> fallbackEmployeeRating(@PathVariable String companyId ) {
		
		List<EmployeeRating> empRatingList = new ArrayList<>();
		empRatingList.add(new EmployeeRating(new Employee("22", "test", "Test", "Hexa"), new Rating(22,"hexa")));
		return empRatingList;
		
		
	}
}

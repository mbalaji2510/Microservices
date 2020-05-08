package com.hexa.employee.employess;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.hexa.employee.model.Employee;

@SpringBootTest
class EmployeeServiceTest {
	
	@Mock
	EmployeeRepository emmployeeRepository;
	
	@InjectMocks
    private EmployeeService empService = new EmployeeService();

	@Test
	void testGetAllEmployes() {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("1", "Vilas","30000","Hexaware"));
		when(emmployeeRepository.findAll()).thenReturn(empList);
		
		List<Employee> resultEmpList = (List<Employee>) empService.getAllEmployes("Hexaware");
		Iterator<Employee> iterator = resultEmpList.iterator();
        if(iterator.hasNext()) {
            Employee emp = iterator.next();
            assertEquals("Vilas", emp.getName(), "Name doesn't match ["+emp.getName()+"]");
        }
		fail("Not yet implemented");
	}

}

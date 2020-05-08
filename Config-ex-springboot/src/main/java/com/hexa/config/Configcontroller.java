package com.hexa.config;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.hexa.config.lobcok.EmployeeLombokEx;

@RestController
public class Configcontroller {
	
	@Value("${my.country}")
    private String country;
	@Value("${list.of.states}")
    private List<String> stateList;
	
	@Value("#{${electionRule}}")//#{} does the trick.
    private Map<String,String> electionRules;
    
	@Autowired
	private EmployeeLombokEx empLombok;
    @RequestMapping("/test")
    public String test() {
    	System.out.println("testing"+country);
    	for (String state : stateList) {
    		System.out.println("State is " +state);
			
		}
        return "My Country is :: "+country;
        
    } 
    
    @RequestMapping("/lombok") 
    public String lombok() {
    	empLombok.setId("22");
    	empLombok.setAddress("Chennai");
    	empLombok.setName("Balu");
    	empLombok.setAdharCard("456");
    	System.out.println(empLombok.getId());
    	System.out.println(empLombok.getName());
    	System.out.println(empLombok.getAddress());
    	System.out.println(empLombok.getAdharCard());
    	return "lombok data loaded";
    }

}

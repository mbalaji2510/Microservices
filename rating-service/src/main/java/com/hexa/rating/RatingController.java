package com.hexa.rating;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/rating")
public class RatingController {
	
	@RequestMapping("/{employeeId}")
	public Rating getEmployeeRatings(@PathVariable String employeeId) {
		return new Rating(3, employeeId);
		//return "this is rating service";
	}

}

package com.example.SpringBoot.Employee;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@RequestMapping("/employees")
	public List<Employee> getAllEmployees() {
		
		return Arrays.asList(
				new Employee("Hari","71935","Ass.Con"),
				new Employee("Rohit","72472","Ass.Con"),
				new Employee("Aakshi","71958","Ass.Con")				
				);
	}
//to test dev branch in github1
}

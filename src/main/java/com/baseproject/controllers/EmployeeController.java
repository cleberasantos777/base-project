package com.baseproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baseproject.entities.EmployeeEntity;
import com.baseproject.repositories.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeRepository er;
	
	@PostMapping(value = "/registration")
	public String createEmployee(EmployeeEntity employeeEntity) {
		er.save(employeeEntity);
		return "redirect/registration";		
	}
	
	@GetMapping(value = "/teste")
	public String teste() {
		return "teste";
	}
}

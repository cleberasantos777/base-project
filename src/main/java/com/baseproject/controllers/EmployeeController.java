package com.baseproject.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baseproject.entities.EmployeeEntity;
import com.baseproject.repositories.EmployeeRepository;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeRepository er;

	@PostMapping(value = "/create-employee")
	public EmployeeEntity creatEmployee(EmployeeEntity employeeEntity) {
		return er.save(employeeEntity);
	}
	
	@GetMapping(value = "/read-all-employees")
	public List<EmployeeEntity> readAllEmployees(){
		return er.findAll();
	}
	
	@GetMapping(value = "/read-one-employee/{id}")
	public Optional<EmployeeEntity> readOneEmployee(@PathVariable Long id) {
		return er.findById(id);
	}

	@PutMapping(value = "/update-employee")
	public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity) {
		return er.save(employeeEntity);		
	}
	
	@DeleteMapping(value = "/delete-employee")
	public void deleteEmployee() {
		er.delete(null);
	}	
	
}

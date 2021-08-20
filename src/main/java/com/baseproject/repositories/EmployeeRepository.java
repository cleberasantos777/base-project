package com.baseproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baseproject.entities.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

	
}

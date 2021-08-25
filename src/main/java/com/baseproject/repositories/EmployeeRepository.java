package com.baseproject.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baseproject.entities.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

	EmployeeEntity save(String name);
	
	Optional<EmployeeEntity> findById(Long id);

	
}

package com.nepal.AngularSpringMVC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nepal.AngularSpringMVC.model.Employee;
import com.nepal.AngularSpringMVC.repository.EmployeeRepository;


@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees(){
		return employeeRepository.getAllEmployeesFromDb();
	}

}

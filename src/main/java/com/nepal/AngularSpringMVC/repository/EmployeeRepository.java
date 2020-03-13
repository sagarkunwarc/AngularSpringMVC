package com.nepal.AngularSpringMVC.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.github.javafaker.Faker;
import com.nepal.AngularSpringMVC.model.Employee;


@Repository
public class EmployeeRepository {

public List<Employee> getAllEmployeesFromDb(){
		
		Faker faker = new Faker();
		
		List<Employee> employeelist = new ArrayList<Employee>();
		for (int i=101; i< 110; i++) {
			
			Employee myemployee = new Employee();
			myemployee.setId(i);
			myemployee.setName(faker.name().fullName());
			myemployee.setMobile(faker.phoneNumber().cellPhone());
            myemployee.setAddress(faker.address().streetAddress());
            myemployee.setCompanyLogo(faker.company().logo());
 
            // Adding the employee records to the employee list.
            employeelist.add(myemployee);
		}
		return employeelist;
	}
}

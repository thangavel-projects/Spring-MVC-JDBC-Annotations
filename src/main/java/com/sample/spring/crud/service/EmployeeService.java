package com.sample.spring.crud.service;

import java.util.List;
import com.sample.spring.crud.domain.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployee();

	public void addEmployeeDetails(String name, String address, String age);
	
}

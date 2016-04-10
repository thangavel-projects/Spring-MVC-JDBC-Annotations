package com.sample.spring.crud.dao;

import java.util.List;
import com.sample.spring.crud.domain.Employee;

public interface EmployeeDAO {

	public List<Employee> getAllEmployeeDetails();

	public void addEmployeeDetails(String name, String address, String age);
	
}

package com.sample.spring.crud.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.sample.spring.crud.dao.EmployeeDAO;
import com.sample.spring.crud.domain.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	public EmployeeDAO employeeDAO;
	
	@Override
	public List<Employee> getAllEmployee() {
		return employeeDAO.getAllEmployeeDetails();
	}

	@Override
	public void addEmployeeDetails(String name, String address, String age) {
		employeeDAO.addEmployeeDetails(name,address,age);
		
	}

}

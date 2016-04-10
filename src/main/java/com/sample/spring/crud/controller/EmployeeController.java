package com.sample.spring.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sample.spring.crud.domain.Employee;
import com.sample.spring.crud.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	public EmployeeService employeeService;
	
	@RequestMapping(value="/DisplayEmployeeDetails", method=RequestMethod.GET)
	public ModelAndView listEmployeeDetails() {
		List<Employee> allEmployeeDetails = employeeService.getAllEmployee();
		ModelAndView modelAndView = new ModelAndView("employee");
		modelAndView.addObject("employeeList", allEmployeeDetails);
		return modelAndView;
	}
	
	@RequestMapping(value="/AddEmployeeDetails")
	public ModelAndView addEmployeeDetails( @RequestParam("name") String name,
			@RequestParam("add") String address,
			@RequestParam("age") String age) {
		
		employeeService.addEmployeeDetails(name,address,age);
		return new ModelAndView("redirect:/DisplayEmployeeDetails");
	}
	
}

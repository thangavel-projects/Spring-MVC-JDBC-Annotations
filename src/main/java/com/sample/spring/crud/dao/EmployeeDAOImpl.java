package com.sample.spring.crud.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.sample.spring.crud.domain.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	@Autowired
	public JdbcTemplate jdbcTemplate;

	@Override
	public List<Employee> getAllEmployeeDetails() {
		List<Employee> listEmployee = jdbcTemplate.query("Select * from employee", new RowMapper<Employee>() {
			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee employee = new Employee(rs.getString("Name"),
						rs.getString("Address"),
						rs.getInt("Age"));
				return employee;
			}
		});
		return listEmployee;
	}

	@Override
	public void addEmployeeDetails(String name, String address, String age) {
		int convertedAge = Integer.valueOf(age);
		String sql = "insert into employee (Name, Address, Age) values ('"+name+"','"+address+"',"+convertedAge+")";
		jdbcTemplate.execute(sql);
	}
}

package com.sample.spring.crud.domain;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String name;
	private String address;
	private int age;
	
	public Employee(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

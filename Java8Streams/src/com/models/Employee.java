 package com.models;

import java.util.Objects;

public class Employee {
	
	private int id;
	private String name;
	private int salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	 @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (!(o instanceof Employee)) return false;
	        Employee employee = (Employee) o;
	        return id == employee.id &&
	               salary == employee.salary &&
	               Objects.equals(name, employee.name);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(id, name, salary);
	    }
	
	
	

}

package com.stream.methods;

import java.util.List;

import com.models.Employee;

public class ForEachmethod {

	public static void main(String[] args) {

		List<Employee> lst = List.of(new Employee(23, "muthu", 4000), new Employee(11, "muthu", 3000),
				new Employee(3, "muthu", 2000), new Employee(3, "muthu", 7000), new Employee(13, "muthu", 9000));
		
		
		lst.forEach(i->System.out.println(i.getSalary()));
		
		
	}
	
}

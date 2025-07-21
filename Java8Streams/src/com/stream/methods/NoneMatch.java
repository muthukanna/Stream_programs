package com.stream.methods;

import java.util.List;

import com.models.Employee;

public class NoneMatch {
	
	public static void main(String[] args) {
		
		
		// Match method will return true or false based on the input
		
				List<Employee> lst = List.of(new Employee(23, "muthu", 1000), new Employee(11, "muthu", 3000),
						new Employee(3, "muthu", 2000), new Employee(3, "muthu", 7000), new Employee(13, "muthu", 9000));
				
				if(lst.stream().noneMatch(i->i.getSalary()<0)) {
					System.out.println("this is non zero salary");
				}
				
				 	
				
		
	}

}

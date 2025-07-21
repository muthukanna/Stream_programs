package com.stream.methods;

import java.util.List;
import java.util.Optional;

import com.models.Employee;

public class FindAnyMethod {
	
	public static void main(String[] args) {
		
		
		// fIND ANY --> RETURNS A ANY EMELENT IN ARRAY
		
				List<Employee> lst = List.of(new Employee(23, "muthu", 4000), new Employee(11, "muthu", 3000),
						new Employee(3, "muthu", 2000), new Employee(3, "muthu", 7000), new Employee(13, "muthu", 9000));
				
				Optional<Employee> any = lst.stream().findAny();
				
				System.out.println(any.get().getSalary());
				
		
	}

}

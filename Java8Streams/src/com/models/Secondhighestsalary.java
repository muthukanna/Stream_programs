package com.models;

import java.util.Arrays;
import java.util.List;

public class Secondhighestsalary {

	public static void main(String[] args) {

		List<Employee> lst = Arrays.asList(new Employee(1, "muthu", 1000), new Employee(1, "ram", 2000),
				new Employee(1, "veera", 3000), new Employee(1, "deva", 4000), new Employee(1, "kishore", 5));

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (Employee e : lst) {

			int salary = e.getSalary();
			if (salary > max) {
				min = max;
				max = salary;
			} else if (salary > min && salary != max) {
				max = salary;
			}
		}

		System.out.println("maximum salary " + max);
		System.out.println("minimum salary " + min);

	}

}

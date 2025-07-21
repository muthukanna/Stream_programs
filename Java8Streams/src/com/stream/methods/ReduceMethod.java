package com.stream.methods;

import java.util.List;
import java.util.Optional;

import com.models.Employee;

public class ReduceMethod {
	
	public static void main(String[] args) {
		
		
		// reduce --> combines a element into single result
		
				List<Integer> lst = List.of(3,5,1,4,1,5,1,5);
				
				Integer reduce = lst.stream().reduce(0, Integer::sum);
				
				System.out.println(reduce);
				
		
	}

}

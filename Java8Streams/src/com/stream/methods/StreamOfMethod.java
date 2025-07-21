package com.stream.methods;

import java.util.stream.Stream;

public class StreamOfMethod {
	
	
	public static void main(String[] args) {
		
		
		int[] zarr = {2,1,2,1,1,1,1,1};
		
		long count = Stream.of(zarr).count();
		
	
		System.out.println(count);
	}

}

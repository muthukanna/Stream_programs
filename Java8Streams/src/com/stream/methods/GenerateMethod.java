package com.stream.methods;

import java.util.stream.Stream;

public class GenerateMethod {
	
	public static void main(String[] args) {
		
		
		
		Stream.generate(Math::random).limit(10).forEach(System.out::println);
	}

}

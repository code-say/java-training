package com.cg.java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Methods {

	public static void main(String[] args) {
	
		//FILTER(Predicate)
			//boolean value function
		
		//map(Function)
		/*
		 each element operation
		 */
		
		List<String> names = Arrays.asList("Aman","Ankit","Abhinav","Durgesh");
		
		List<String> newNames = names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
		System.out.println(newNames);
		
		List<Integer> number= Arrays.asList(23,4,2,5,7,4);
		List<Integer> newNumbers = number.stream().map(i-> i * i).collect(Collectors.toList());
		System.out.println(newNumbers); 
		
		names.stream().forEach(e->{
			System.out.println(e);
		});
		
		newNames.stream().forEach(System.out::println);
		
		//sort
		
		number.stream().sorted().forEach(System.out::println);
		
		Integer integer = number.stream().min((x,y) -> x.compareTo(y)).get();
		System.out.println("min "+integer);
		
		
	}
}

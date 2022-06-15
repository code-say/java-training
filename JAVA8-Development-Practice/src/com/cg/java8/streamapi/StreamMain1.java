package com.cg.java8.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {

	public static void main(String[] args) {
		
		
		//Q)create a list and filter all even numbers from list
		//List<Integer> list1 = List.of(2, 4, 50, 21, 22, 67);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(12);
		list2.add(34);
		list2.add(23);
		list2.add(78);
		
		List<Integer> list1= Arrays.asList(2, 4, 50, 21, 22, 67);
		
		//List1
		//without stream
		List<Integer> listEven=new ArrayList<>();
		
		for(Integer i:list1)
		{
			if(i % 2==0) //mod
			{
				listEven.add(i);
			}
		}
		
		System.out.println(list1);
		System.out.println(listEven);
		
		//using stream
		
		Stream<Integer> stream = list1.stream();
		List<Integer> newList = stream.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(newList);
		
		List<Integer> newList1 = list1.stream().filter(i->i>10).collect(Collectors.toList());
		System.out.println(newList1);
		
	}
}

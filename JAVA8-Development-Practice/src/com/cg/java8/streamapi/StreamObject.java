package com.cg.java8.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {

	public static void main(String[] args) {
		
		//Stream API - collection process
		//collection //group of object
		
		//1 - blank
		Stream<Object> emptyStream = Stream.empty();
		//emptyStream.forEach(e -> {
			//System.out.println(e);
		//});
		
		//2 - array, object, collection
		String names[] = {"Durgesh", "Uttam", "Ankit", "Divya"};
		
		Stream<String> stream1 = Stream.of(names);
		
		stream1.forEach(e->{
			System.out.println(e);
		});
		
		//3 
		Stream<Object> streamBuilder = Stream.builder().build();
		
		//2
		IntStream stream = Arrays.stream(new int[] {2,4,65,3,564});
		stream.forEach(e -> {
			System.out.println(e);
		});
		
		//5. List, Set
		List<Integer> list2 = new ArrayList<>();
		list2.add(12);
		list2.add(34);
		list2.add(23);
		list2.add(78);
		
		Stream<Integer> stream2 = list2.stream();
		stream2.forEach(e-> {
			System.out.println(e);
		});
		
		
		
	}
}

package com.cg.java8.streamapi;

import java.util.List;
import java.util.Arrays;

// For in this Program we use (For Loop, ForEach with Method Reference, For Each Loop, For Each Loop with Lambda)

public class StreamAPIDemo3_FilterLimit {
	
	public static void main(String[] args) {
		
		List<Integer> listInt = Arrays.asList(11,22,33,44,55,66,44);
				
		System.out.println("ForEach with Method Reference Print");
		
		// 1,2,3,4,5,6,7
		
		listInt.stream().limit(4).forEach(System.out::println);
		

}
}

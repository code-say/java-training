package com.cg.java8.streamapi;

import java.util.List;
import java.util.Arrays;

// For in this Program we use (For Loop, ForEach with Method Reference, For Each Loop, For Each Loop with Lambda)

public class StreamAPIDemo1 {
	
	public static void main(String[] args) {
		
		List<Integer> listInt = Arrays.asList(1,2,3,4,5,6,7);
		
		System.out.println("For Loop");
		for(int i=0; i<7; i++)
			System.out.println(listInt.get(i));
		
		System.out.println("ForEach with Method Reference Print");
		listInt.stream().forEach(System.out::println);
		
		System.out.println("For Each Loop");
		for(int gm:listInt)
			System.out.println(gm);
		
		System.out.println("For Each Loop with Lambda");
	
	listInt.forEach(gm->System.out.println(gm));

}
}

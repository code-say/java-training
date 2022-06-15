package com.cg.corejava.collectionframework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo4 {

	public static void main(String[] args) {
		HashSet myset = new HashSet();
		
		myset.add(100);
		myset.add(45.5);
		myset.add("Sayan");
		myset.add(100);
		
		System.out.println(myset);
		
		Iterator i1=myset.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}

}

package com.cg.corejava.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		ArrayList mylist = new ArrayList();
		mylist.add(100);
		mylist.add(45.5);
		mylist.add("Sayan");
		mylist.add(100);
		
		System.out.println(mylist);
		
		Iterator i1=mylist.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}

}

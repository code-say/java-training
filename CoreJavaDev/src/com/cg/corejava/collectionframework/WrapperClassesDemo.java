package com.cg.corejava.collectionframework;

import java.util.ArrayList;

public class WrapperClassesDemo {

	public static void main(String []args) {
		int a1=100;
		float f1;
		double d1;
		
		Integer t1 = new Integer(a1);
		System.out.println(t1);
		
		
		ArrayList mylist = new ArrayList(t1);
		System.out.println(mylist);
	}
}

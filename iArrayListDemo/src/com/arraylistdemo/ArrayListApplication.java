//ArrayList implements list interface
package com.arraylistdemo;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListApplication {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Code");
		al.add("Sayan");
		al.add("Tia");
		al.add("jake");
		
		System.out.println(al);
		
		for(String s:al)
		{
			System.out.println(s);
		}
		
		Iterator iter = al.iterator();
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
				
		ArrayList<Integer> al2=new ArrayList<Integer>();
		
		al2.add(12);
		al2.add(456);
		al2.add(34);
		al2.add(100);
		
		System.out.println(al2);
		
		Iterator iter2 = al2.iterator();
		
		while(iter2.hasNext())
		{
			System.out.println(iter2.next());
		}
		
		for(Integer i:al2)
		{
			System.out.println(i);
		}
	}
}

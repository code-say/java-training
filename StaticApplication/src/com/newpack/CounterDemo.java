package com.newpack;

class Counter {
static	int count;
	
	Counter()
	{
		count ++;
	}
	public void show_counter() {
		System.out.println("The count = "+count);
	}
}
public class CounterDemo {

	public static void main(String[] args) {
		Counter c1 = new Counter();
		
		c1.show_counter();
		
		Counter c3 = new Counter();
		c3.show_counter();
	}
}

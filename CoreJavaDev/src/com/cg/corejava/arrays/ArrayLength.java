package com.cg.corejava.arrays;

public class ArrayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = new int[5];
		
		//array initialization
		for(int count = 0; count < arr.length; ++count)
			arr[count]=1 + 2*count;
		
		//display the values
		System.out.println("Index \t Value");
		for(int count =0; count < arr.length;++count)
			System.out.println(count + "\t" + arr[count]);
	}

}

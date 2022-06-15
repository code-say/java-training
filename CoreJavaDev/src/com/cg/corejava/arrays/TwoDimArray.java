package com.cg.corejava.arrays;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declare two dimensional array
		int[][] array = new int[3][5];
		
		int row,col,n=1;
		
		//populating the array
		for(row=0;row<3; ++row)
		{
			for(col=0; col<5; ++col, ++n)
				array[row][col]=n;
		}
		
		//display the array
		for(row=0; row < 3; ++row)
		{
			for(col = 0; col < 5; ++col)
				System.out.print(array[row][col] + "\t");
			System.out.println();
		}

	}

}

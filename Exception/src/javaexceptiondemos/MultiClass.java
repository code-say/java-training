package javaexceptiondemos;

import java.io.*;
import java.util.Scanner;

public class MultiClass {

	public static void main(String[] args) {
		
		try 
		{
			System.out.println("Enter the two numbers to divide");
			Scanner sc = new Scanner(System.in);
			
			int a = sc.nextInt();
			
			int b = sc.nextInt();
			
			int c = a/b;
			
			System.out.println("The division is equal to "+c);
			
			int [] arr = new int[3];
			
			arr[5] = 45;
		}catch(ArithmeticException e)
		{
			System.out.println(e);
			
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
	}
}

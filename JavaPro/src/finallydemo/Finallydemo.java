//CASE ONE- when an exception does not happen
package finallydemo;

import java.util.Scanner;

public class Finallydemo {

	public static void main(String[] args) {
		try {
		int a = 34;
		
		System.out.println("enter the value for b: ");
		
		Scanner sc = new Scanner(System.in);
		
		int b = sc.nextInt();
		
		int c = a/b;
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally gets executed when exception does not occur");
		}
	}
}
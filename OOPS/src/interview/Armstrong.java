package interview;

import java.util.Scanner;

public class Armstrong {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int num = sc.nextInt();
		
		int n = num;
		int sum=0, remainder;
		
		while(num > 0)
		{
			remainder = num % 10;
			sum = sum + (remainder*remainder*remainder);
			
			num = num / 10;
		}
		
		if(sum == n)
			System.out.println(n+" is an Armstrong Number");
		else
			System.out.println(n+" is not a Armstrong Number");
	}
}

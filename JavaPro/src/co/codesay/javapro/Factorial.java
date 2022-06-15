package co.codesay.javapro;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("which number's factorial: ");
		int num = sc.nextInt();
		
		Factorial fobj = new Factorial();
		int fact = fobj.factorial(num);//method call for getting factorial of num
		
		System.out.println("Factorial of"+num+" = "+ fact);
		
	}
	
	int factorial(int n) {
		int fact =1;
		for(int i=1; i<=n; i++) {
			fact *= i;
		}
		return fact;
	}
}

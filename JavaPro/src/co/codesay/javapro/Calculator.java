package co.codesay.javapro;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter first no: ");
		int no1 = sc.nextInt();
		
		System.out.println("enter second no: ");
		int no2 = sc.nextInt();
		
		System.out.println("enter required operation[+,-,*,/]: ");
		char operator = sc.next().charAt(0);
		
		if(operator=='+' || operator=='-' || operator=='*' || operator=='/') {
			int res = calculate(no1,no2,operator);
			System.out.println(no1+" "+operator+" "+no2+" = "+res);
		}
		else {
			System.out.println("Invalid operations.....Please try for +, -, *, /");
		}
		sc.close();
	}
	
	//--method to perform operations
	
	static int calculate(int x, int y, char operator) {
		int res = 0;
		switch(operator)
		{
		case '+':
			res=x+y;
			break;
		case '-':
			res=x-y;
			break;
		case '*':
			res=x*y;
			break;
		
		case '/':
			res=x/y;
			break;
		}//switch
		return res;
	}//method calculate
}

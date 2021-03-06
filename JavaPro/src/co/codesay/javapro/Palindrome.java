package co.codesay.javapro;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a string for checking as palindrome: ");
		
		String word = sc.next();
		
		if(isPalindrome(word))
			System.out.println(word+" is palindrome");
		else
			System.out.println(word+" is NOT Plaindrome");
	}
	
	static boolean isPalindrome(String word) {
		int forwardIndex=0, backwordIndex=word.length()-1;
		while(forwardIndex<=backwordIndex) {
			char startChar = word.charAt(forwardIndex);
			char endChar = word.charAt(backwordIndex);
			if(startChar != endChar)
				return false;
			forwardIndex++;
			backwordIndex--;
		}
		return true;
	}
	
	
	
	
	
}

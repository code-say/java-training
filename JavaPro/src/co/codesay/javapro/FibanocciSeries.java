package co.codesay.javapro;
import java.util.Scanner;

public class FibanocciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("how many fibonacci series numbers: ");
		int num = sc.nextInt();
		
		/*--method call */
		displayFibanocciSeries(num);
		sc.close();
	}
	
	static void displayFibanocciSeries(int n) {
		int x=1,y=0,z=0,count=1;
		while(count<=n) {
			System.out.println(z+" ");
			z=x+y;
			x=y;
			y=z;
			count++;
		}
	}
}

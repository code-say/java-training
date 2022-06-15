import java.util.*;
public class PrimeNumbers {

	public static void main(String[] args)
	{
	    int input=0;
	    System.out.println("Enter a Number");
		Scanner scn=new Scanner(System.in);
		int number = scn.nextInt();
		
		for(int n=2; n<= number; n++) {
			int count=0;
			
			for(int div =2; div * div <=n; div++) {
				if(n % div == 0) {
					count++;
					break;
				}
			}
			
			if(count ==0) {
				System.out.println(n);
				System.out.println("gg");
			}
		}
	}
	
}

import java.util.*;
public class NaturalNumberSumDemo {

	public static void main(String[] args) {
		int n,calculateSum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			calculateSum=calculateSum+i; 
				System.out.println("CalcualteSum="+calculateSum);
		}
		if (calculateSum % 3 == 0 && calculateSum % 5 ==0)
			System.out.println("divisible by 3 and 5");
		else
			System.out.println("not divisible by 3 and 5");
	}

}

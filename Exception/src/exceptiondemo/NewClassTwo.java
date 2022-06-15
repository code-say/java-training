package exceptiondemo;

public class NewClassTwo {

	static int [] arr = {23,45,78,12};
	
	public static void main(String[] args) {
	
		try 
		{
			arr[7] =45;
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		for(int i: arr)
		{
			System.out.println(arr[i-1]);
		}
		
	}
}

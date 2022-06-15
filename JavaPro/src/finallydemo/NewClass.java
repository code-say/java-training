//CASE--TWO WHEN EXCEPTION OCCURS
package finallydemo;

public class NewClass {

	public static void main(String[] args) {
		try 
		{
			int a = 34/0;
		}
		catch(ArithmeticException e) 
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("hello from finally after exception is being handles by catch");
		}
	}
}

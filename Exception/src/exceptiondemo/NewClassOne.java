package exceptiondemo;

public class NewClassOne {

	public static void main(String[] args) {
		//Arithmetic exception
		try {
			int a = 34;
			int b =0;
			int c = a/b;
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("Division by Zero is not defined");
	}
}

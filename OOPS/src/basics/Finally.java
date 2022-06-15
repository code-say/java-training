package basics;

public class Finally {

	public static void main(String[] args) {
		// try and catch block
		boolean b = true;
		
		try {
			int a = 5/0;
			
			int ss[] = {4,5,8};
			System.out.println(ss[4]); //ArrayIndexOfBoundsException 
			
		}catch (NullPointerException e){
			System.out.println("You got Exception bro");
			
		}
		catch(ArithmeticException e) {
			System.out.println("You got Arithmetic Ex");
		}
		finally {
			System.out.println("This is a finally block");
		}
		
		
		System.out.println("New Line of code");
	}

}

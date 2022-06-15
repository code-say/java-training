package basics;

public class Handling_Exceptions2 {

	public static void main(String[] args) {
		// try and catch block
		boolean b = true;
		
		try {
			int a = 5/0;
			
			int ss[] = {4,5,8};
			System.out.println(ss[4]); //ArrayIndexOfBoundsException 
			
		}catch (Exception e){
			System.out.println("You got Exception bro");
			e.printStackTrace();
			
		}
		System.out.println("New Line of code");
	}

}

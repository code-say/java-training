package basics;

public class TryCatch {

	public static void main(String[] args) {
	
		try {
			int s[] = {1,2,3} ;
			int a = s[3];
		} catch(Exception e)
		{
			System.out.println("You got error");
		}

	}

}

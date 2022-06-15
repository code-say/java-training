package javaexceptiondemos;

public class javaExceptiondemos {

	public static void main(String[] args) {
		//NullpOINTEReXCEPTIONS
		try {
		
			String s = null;
			System.out.println(s.length());
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}

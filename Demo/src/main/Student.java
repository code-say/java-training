package main;

public class Student {
	
	public String name;
	public String surname;
	public String email;
	public int age;
	
	public static void create() {
		System.out.println("I am a static method, I belongs to class");
	}
	
	public void create2() {
		System.out.println(" Student object is created and you used this method");
	}

}

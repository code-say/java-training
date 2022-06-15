package Inheritance;

public class Student extends Person {
	public Student(String name,String surname, int age){
		super(name, surname, age);
		// super.getName();
	}
	public static void run() {
		System.out.println("Student is running");
	}
	public String read(String bookName) {
		return bookName;
	}
	// extends
	//persons is our parent class or super class or base class
	// teacher or student is our child class
}

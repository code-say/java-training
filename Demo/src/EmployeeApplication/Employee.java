package EmployeeApplication;

public class Employee {

	private String name;
	private String surname;
	private int age;
	
	public Employee(String name, String surname, int age) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	public void work() {
		System.out.println(name + "is Working");
	}
	
	
	
}

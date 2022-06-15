package EmployeeApplication;

public class Programmer extends Employee {

	public Programmer(String name, String surname,int age) {
		super(name,surname,age);
		// super() //go and call constructor of super class
		// super. // it means go and call variable of super class
	}

	@Override ///annotation
	public void work() {
		super.work();
	}
	
	//override
	//go and call a method from superClass and write something over it
}

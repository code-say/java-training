package basics;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person();
		p1.age = 24;
		p1.name = "Anuj";
		
		Person p2 = new Person(31, "shivam");
		
//		p2.age =31;
//		p2.name = "Shivam";
		
		p1.eat();
		p2.walk();
		p2.walk(2);
		
		System.out.println(Person.count);
	}

}

class Person {
	String name;
	int age;
	
	static int count;
	
	public Person() {
		count++;
		System.out.println("creating an object");
	}
	
	public Person(int age, String name)
	{
		this();
		this.name = name;
		this.age = age;
	}
	void walk() {
		System.out.println(name + " is walking.");
	}
	
	void eat() {
		System.out.println(name + " is eating.");
	}
	
	void walk(int steps) {
		System.out.println(name + " walked "+ steps );
	}
}

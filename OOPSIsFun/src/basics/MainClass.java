package basics;

public class MainClass {
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.age = 24;
		p1.name = "Sayan";
		
		System.out.println(p1.age + " "+ p1.name);
	}

}

class Person {
	String name;
	int age;
}

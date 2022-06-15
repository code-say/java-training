package SocialNetworking;

import java.time.LocalDate;

public class Person {

	public enum Sex {
		MALE,FEMALE
	}
	
	String name;
	LocalDate age;
	Sex gender;
	String emailAddress;
	
	public String getName() {
		return name;
	}
	
	public LocalDate getAge() {
		return age;
	}
	
	/*
	public static void printPersonOlderThan(List<Person> roster, int age) {
		for(Person p : roster) {
			if(p.getAge() >= age) {
				p.printPersonOlderThan();
			}
		}
	} */
	
}

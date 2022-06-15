package SetterGetter;

public class Main {

	public static void main(String args[]) {
		Student st = new Student();
		st.setName("Sayan");
		st.setSurname("Mandal");
		
		String name = st.getName();
		System.out.println(name);
		
		System.out.println(st.getSurname());
	}
}

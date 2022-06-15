package studentsinclassroom;

public class Launcher {

	public static void main(String[] args) {
		Classroom classroom = new Classroom();
		Students s = new Students();
		s.setName("Yash");
		s.setSecondName("Sayan");
		
		classroom.enter(s);
		classroom.printStudentInfo();
		classroom.leave(s);
		classroom.printStudentInfo();

	}

}

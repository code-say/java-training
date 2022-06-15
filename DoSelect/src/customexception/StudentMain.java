package customexception;

public class StudentMain {

	public static void main(String[] args) {
		StudentDB database = new StudentDB();
		try {
			Student s = database.getStudent(6); //there is no record for rollno 6
			System.out.println("Student name is :"+s.getName()); //so the code will throw exception
			}
		catch(StudentNotFoundException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}

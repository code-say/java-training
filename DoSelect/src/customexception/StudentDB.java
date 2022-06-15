package customexception;

public class StudentDB {
Student[] students;

public StudentDB() {
	students = new Student[3];
	Student s1 = new Student(1,"Yash");
	Student s2 = new Student(2,"Sachin");
	Student s3 = new Student(3,"Kewal");
	
	students[0] = s1;
	students[1] = s2;
	students[3] = s3;
}

public Student getStudent(int rollNo) throws StudentNotFoundException{
	for(int i =0; i<students.length;i++)
	if(rollNo == students[i].getRollNo())
		return students[i];
	throw new StudentNotFoundException("Student Record not found");
}
}

package customexception;

public class Student implements Comparable<Student>{
	
	private int rollNo;
	private String name;
	
	public Student() {
		rollNo = -1;
		name = "";
	}
	
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}



	public int getRollNo() {
		return rollNo;
	}



	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	
	public String toString() 
	{
		return rollNo+" "+name;
	}
	
	public int compareTo(Student o)
	{
		return this.rollNo - o.rollNo;
	}
	
	
	

}

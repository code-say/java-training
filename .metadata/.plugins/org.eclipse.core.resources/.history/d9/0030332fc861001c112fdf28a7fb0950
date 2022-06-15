package com.cg.markscalculate;

public class StudentService {
	
	public int addBookService(int studentId,String sub,double marks)throws Exception{
		System.out.println("In Service Layer : "+studentId+sub+marks);
		
	String grade="";
	
	if(marks<=50)
	{
		grade="C";
	}
	else if(marks<=70)
	{
		grade ="B";
	}
	else
	{
		grade = "A";
	}
	
	StudentBean studentBean=new StudentBean();
	studentBean.setStudentId(studentId);
	studentBean.setSub(sub);
	studentBean.setMarks(marks);
	studentBean.setGrade(grade);
	
	StudentDAO studentDAO = new StudentDAO();
    int k=  studentDAO.addStudent(studentBean);
	
		return k;
		
	}

}

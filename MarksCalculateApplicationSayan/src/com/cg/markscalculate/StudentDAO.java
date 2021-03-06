package com.cg.markscalculate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDAO {
	
	int i;
	public int addStudent(StudentBean StudentBean) throws ClassNotFoundException, SQLException 
	{
		System.out.println("In StudentDAO.");
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "capgreact2";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root"; 
		String password = "root";	
		
			Class.forName(driver);
			conn = DriverManager.getConnection(url+dbName,userName,password);
			
			String query="insert into student1 values(?,?,?,?)";	
			
PreparedStatement pstmt=conn.prepareStatement(query);
			
			//Step :  Set parameters
            pstmt.setInt(1,StudentBean.getStudentId());
			pstmt.setString(2,StudentBean.getSub());
			pstmt.setDouble(3,StudentBean.getMarks());
			pstmt.setString(4,StudentBean.getGrade());
			
			int i=pstmt.executeUpdate();
			//System.out.println("Record inserted count :"+i);
							
		return i;
		
	}
	

}

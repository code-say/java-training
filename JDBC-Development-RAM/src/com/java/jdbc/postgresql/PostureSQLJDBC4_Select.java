package com.java.jdbc.postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class PostureSQLJDBC4_Select {
   public static void main( String args[] ) {
      Connection con = null;
      Statement stmt = null;
      try {
         Class.forName("org.postgresql.Driver");
         con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
            "postgres", "sayan123");
        // con.setAutoCommit(false);
         System.out.println("Opened database successfully");

         stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery( "SELECT * FROM myemp;" );
       while ( rs.next() ) {
        	    System.out.println(" I D :"+rs.getInt("eno"));
        	    System.out.println("Name :"+rs.getString("ename"));
        	    //System.out.println("Address :"+rs.getString("address"));
        	    System.out.println("Salary :"+rs.getFloat("sal"));
        	 
        	 
        	 
				
         }
         rs.close();
         stmt.close();
         con.close();
      } catch ( Exception e ) {
        System.out.println(e);
      }
      System.out.println("Operation done successfully");
   }
}
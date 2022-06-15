package com.cg.corejava.io.serilization;
import java.io.*;
public class DeserilizationDemo {

public static void main(String[] args) {
		
		ProductBean p;
		try {
		FileInputStream fis=new FileInputStream("E:\\capgdata\\product.txt"); //d:\\capgdata\\product.txt
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		while((p=(ProductBean)ois.readObject())!=null)
             {
            	System.out.println(p);  	
            } 
		
		}
		catch(Exception  e)
		{
			System.out.println("End of the file ");
		}
	}
}

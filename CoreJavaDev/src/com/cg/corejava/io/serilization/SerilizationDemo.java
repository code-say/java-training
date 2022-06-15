package com.cg.corejava.io.serilization;

import java.io.FileOutputStream;
import java.io.*;
public class SerilizationDemo {
	public static void main(String[] args) {
		try {
		 FileOutputStream fos=new FileOutputStream("e:\\capgdata\\product.txt");
		  ObjectOutputStream oos=new ObjectOutputStream(fos); 
		 
		 ProductBean p1=new ProductBean(100,"Mouse",450);
		 ProductBean p2=new ProductBean(200,"Keybor",350);
		 ProductBean p3=new ProductBean(300,"HDMI Cable",550);
		 System.out.println("Writing Object into the Stream");
		 
		 oos.writeObject(p1);
		 oos.writeObject(p2);
		 oos.writeObject(p3);
		 		 
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}

	}

}

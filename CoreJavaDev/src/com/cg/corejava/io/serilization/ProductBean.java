package com.cg.corejava.io.serilization;

import java.io.Serializable;

public class ProductBean  implements Serializable{
	private int pid;
	private String pname;
	private double price;
	
	public ProductBean(int pid,String pname,double price)
	{
		this.pid=pid;
		this.pname=pname;
		this.price=price;
		
	}
	public String toString()
	{
		return pid+" "+pname+" "+price;
	}

}

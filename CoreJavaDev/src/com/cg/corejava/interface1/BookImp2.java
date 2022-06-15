package com.cg.corejava.interface1;
// we cant create object to interface but we create object to reference to interface

interface Book2 {
	public abstract void bookTitle();
	public void bookAuthor();
	public void bookPrice();
}

public class BookImp2 implements Book2 { //BookImp1 means implementation of Book
	
	public void bookTitle() {
		System.out.println("CoreJava");
	}
	public void bookAuthor()
	{
		System.out.println("Our Java Class Students");
	}
	public void bookPrice() {
		System.out.println("Rs. 550");
	}
	public void myData() {
		System.out.println("Local methods of BookImp");
	}
	public static void main(String[] args) {
	
		Book2 book1=new BookImp2();
		book1.bookTitle();
		book1.bookAuthor();
		book1.bookPrice();
		//Local class method
		//book1.myData(); //i want only interface methods i dont want implement class method

	}
	}

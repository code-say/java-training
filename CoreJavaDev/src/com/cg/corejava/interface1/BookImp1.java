package com.cg.corejava.interface1;


interface Book {
	public abstract void bookTitle();
	public void bookAuthor();
	public void bookPrice();
}

public class BookImp1 implements Book { //BookImp1 means implementation of Book
	
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
	
		BookImp1 book1=new BookImp1();
		book1.bookTitle();
		book1.bookAuthor();
		book1.bookPrice();
		//Local class method
		book1.myData();

	}
	}

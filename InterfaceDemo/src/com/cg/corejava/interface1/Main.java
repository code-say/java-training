package com.cg.corejava.interface1;

public class Main {

	public static void main(String[] args) {
		//DeskPhone myPhone = new DeskPhone("123456"); //myNumber
		//myPhone.powerOn();
		//myPhone.callPhone("123456"); //phoneNumber
		//myPhone.answer();
		
		
		//MobilePhone myPhone = new MobilePhone("12345");
		//myPhone.powerOn();
		//myPhone.callPhone("12345"); //phoneNumber
		//myPhone.answer();
		
		GameDev gameDev=new GameDev("Sayan","Mandal","java",21);
		
		FrontEndDev frontEndDev=new FrontEndDev("Code","Say","React",22);
		gameDev.comeEarly();
		gameDev.testCode();
		gameDev.writeCode();
		System.out.println("*************************************************");
		frontEndDev.comeEarly();
		frontEndDev.testCode();
		frontEndDev.writeCode();
		
	}

}

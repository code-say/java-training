package com.cg.corejava.interface1;

public class ComapanyX implements Bank {

	@Override
	public void payTaxes() {
		System.out.println("This Company will pay 100$");
		
	}

	@Override
	public void payCredits() {
		System.out.println("This company will pay credits in 2 months");
		
	}

	@Override
	public void verifyYourself() {
		System.out.println("This company verified itself");
		
	}

	@Override
	public String transfer() {
		return "Hey,I didn't not transfer money";
	}
	
	
}

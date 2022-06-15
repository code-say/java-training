package com.cg.corejava.interface1;

public class companyY implements Bank {

	@Override
	public void payTaxes() {
		System.out.println("This company will not pay anything");
		
	}

	@Override
	public void payCredits() {
		System.out.println("404 Not Found");
		
	}

	@Override
	public void verifyYourself() {
		System.out.println("This company is verified");
		
	}

	@Override
	public String transfer() {
		return "Hey, I did transfer money";
	}

}

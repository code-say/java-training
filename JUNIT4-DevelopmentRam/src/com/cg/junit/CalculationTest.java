package com.cg.junit;

import junit.framework.TestCase;

public class CalculationTest extends TestCase {
	
	
	public void testMethods() {
		
		Calculation cal = new Calculation();
		
		assertEquals(30,cal.addition(15,15));
		assertEquals(10,cal.subtraction(20, 10));
		assertEquals(4.0,cal.multipaly(2, 2));
	}

}

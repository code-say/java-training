package com.cg.junit;

import junit.framework.TestCase;

public class CalculationTest extends TestCase{

	public void testMethods() {
		
		Calculation cal = new Calculation();
		
		assertEquals(30,cal.addition(15, 15));
		
		
	}
}

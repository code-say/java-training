package com.cg.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class JunitTest3 {

	@Test
	public void TestAdd() {
		
		int eno=10;
		
		String str = "Junit4 Testing";
		
		assertEquals("Junit4 Testing",str);
		assertNotNull(str);
		
		assertFalse(eno>10);
	}
}

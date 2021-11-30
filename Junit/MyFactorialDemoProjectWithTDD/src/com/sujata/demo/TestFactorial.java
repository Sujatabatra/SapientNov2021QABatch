package com.sujata.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestFactorial {

	private Factorial factorial;
	
	@BeforeEach
	void setUp() throws Exception {
		factorial=new Factorial();
	}

	@AfterEach
	void tearDown() throws Exception {
		factorial=null;
	}

	@Test
	void testCase1() {
		factorial.setNumber(4);
		factorial.calculateFactorial();
		assertEquals(24, factorial.getFactorial());
	}

}

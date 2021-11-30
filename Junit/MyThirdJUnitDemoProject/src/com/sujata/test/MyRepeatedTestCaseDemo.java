package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class MyRepeatedTestCaseDemo {

	@Test
	@RepeatedTest(2)
	void test1() {
		assertEquals(3, 2+1);
	}
	
	@Test
	@RepeatedTest(3)
	void test2() {
		assertEquals(3, 2+1);
	}
	
	@Test
	void test3() {
		assertEquals(3, 2+1);
	}
	

}

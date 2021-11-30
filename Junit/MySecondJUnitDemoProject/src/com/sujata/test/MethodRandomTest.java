package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.Random.class)
class MethodRandomTest {

	@Test
	void testX() {
		assertEquals(2, 1+1);
	}
	
	@Test
	void testA() {
		assertEquals(2, 1+1);
	}
	
	@Test
	void test1() {
		assertEquals(2, 1+1);
	}
	
	@Test
	void test9() {
		assertEquals(2, 1+1);
	}
	
	@Test
	void test100() {
		assertEquals(2, 1+1);
	}

}

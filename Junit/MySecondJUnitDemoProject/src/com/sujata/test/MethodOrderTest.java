package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MethodOrderTest {

	@Test
	@Order(3)
	void testX() {
		assertEquals(2, 1+1);
	}
	
	@Test
	@Order(1)
	void testA() {
		assertEquals(2, 1+1);
	}
	
	@Test
	@Order(2)
	void test1() {
		assertEquals(2, 1+1);
	}
	
	@Test
	@Order(4)
	void test9() {
		assertEquals(2, 1+1);
	}
	
	@Test
	@Order(5)
	void test100() {
		assertEquals(2, 1+1);
	}

}

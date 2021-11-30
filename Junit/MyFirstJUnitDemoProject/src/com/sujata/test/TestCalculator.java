package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sujata.demo.Calculator;
import com.sujata.exception.NegativeNumberException;

class TestCalculator {

	private Calculator calculator;
	@BeforeEach
	void setUp() throws Exception {
		calculator=new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator=null;
	}

	@Test
	void t001() {
		int expected=30;
		int actual=calculator.add(10, 20);
		assertEquals(expected,actual);
//		assertEquals(30, calculator.add(10, 20));
	}

	@Test
	void t002() {
		assertEquals(10, calculator.add(-10, 20));
	}
	
	@Test
	void t003() {
		assertEquals(-30, calculator.add(-10, -20));
	}

	@Test
	void t004() {
		assertEquals(-10, calculator.add(10, -20));
	}
	
	@Test
	void t005() throws NegativeNumberException {
		assertEquals(10, calculator.divide(20, 2));
	}
	@Test
	String t006() {
		assertThrows(ArithmeticException.class,()->calculator.divide(10, 0));
		return "sujata";
	}
	@Test
	void t007() throws NegativeNumberException {
		assertEquals(0, calculator.divide(0, 10));
	}
	
	@Test
	void t008() {
		assertThrows(NegativeNumberException.class,()->calculator.divide(-10, 3));
	}
	
	@Test
	void t009() {
		assertThrows(NegativeNumberException.class,()->calculator.divide(-10, 0));
	}
	@Test
	void t010() {
		assertThrows(NegativeNumberException.class,()->calculator.divide(0, -10));
	}
	
}

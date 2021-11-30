package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import com.sujata.demo.Calculator;
import com.sujata.exception.NegativeNumberException;

//@Disabled("Till the time bug 169 don't get resolved")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@DisplayName("Testing calculator class methods")
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

	@DisplayName("testing add with two positive integers")
	@Test
	void t001() {
		int expected=30;
		int actual=calculator.add(10, 20);
		assertEquals(expected,actual);
//		assertEquals(30, calculator.add(10, 20));
	}

	@Test
	void test_add_for_positive_and_negative_integer() {
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
	
	@Disabled("till bug 567 not get resolved")
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

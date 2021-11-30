package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.sujata.demo.Calculator;
import com.sujata.exception.NegativeNumberException;



class TestCalculator {

	private Calculator calculator;

	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator = null;
	}

	@ParameterizedTest
	@MethodSource("intIntAndIntProvider")
	void t001(int number1,int number2,int ans) {
		assertEquals(ans, calculator.add(number1, number2));
	}

	static Stream<Arguments> intIntAndIntProvider() {
        return Stream.of(
                Arguments.arguments(10, 20, 30),
                Arguments.arguments(-10, 20, 10),
                Arguments.arguments(-10, -20, -30),
                Arguments.arguments(10, -20, -10)
        );
    }
//	@Test
//	void test_add_for_positive_and_negative_integer() {
//		assertEquals(10, calculator.add(-10, 20));
//	}
//
//	@Test
//	void t003() {
//		assertEquals(-30, calculator.add(-10, -20));
//	}
//
//	@Test
//	void t004() {
//		assertEquals(-10, calculator.add(10, -20));
//	}

	@Test
	void t005() throws NegativeNumberException {
		assertEquals(10, calculator.divide(20, 2));
	}

	@Test
	void t006() {
		assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));

	}

	@Test
	void t007() throws NegativeNumberException {
		assertEquals(0, calculator.divide(0, 10));
	}

	@Test
	void t008() {
		assertThrows(NegativeNumberException.class, () -> calculator.divide(-10, 3));
	}

	@Test
	void t009() {
		assertThrows(NegativeNumberException.class, () -> calculator.divide(-10, 0));
	}

	@Test
	void t010() {
		assertThrows(NegativeNumberException.class, () -> calculator.divide(0, -10));

	}
}

package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import com.sujata.demo.Calculator;

class TestCalculatorCalculate {

	@Test
	@Timeout(value = 2000,unit = TimeUnit.MILLISECONDS)
	void testCalculate() {
		Calculator calculator=new Calculator();
		assertEquals(9, calculator.calculate(3));
	}
	@Test
	void test_add_for_positive_and_negative_integer() {
		Calculator calculator=new Calculator();
		assertEquals(10, calculator.add(-10, 20));
	}
	
	@Test
	void t003() {
		Calculator calculator=new Calculator();
		assertEquals(-30, calculator.add(-10, -20));
	}

}

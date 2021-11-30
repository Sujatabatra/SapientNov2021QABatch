package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 * Sequence of execution
 * 1. method annotated with @BeforeAll : setupBeforeclass
 * -----------------------------------------------
 * 2. method annotated with @BeforeEach
 * 3. method annotated with @Test
 * 4. method annotated with @AfterEach
 * -------------------------------------------
 * 2. method annotated with @BeforeEach
 * 3. method annotated with @Test
 * 4. method annotated with @AfterEach
 * --------------------------------------------------
 * 5. method annotated with @AfterAll
 */
class TestCalculateForSequenceOfExecution {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("setup before class");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("tear down after class");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("setup");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("tear down");
	}

	//test case : method must return void, ur method must not be private
	@Test
	void testAdd() {
		System.out.println("test case 1");
	}

	@Test
	void testDivide() {
		System.out.println("test case 2");
//		fail("Not yet implemented");
	}

}

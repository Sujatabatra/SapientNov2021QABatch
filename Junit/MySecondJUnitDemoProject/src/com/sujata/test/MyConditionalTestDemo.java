package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class MyConditionalTestDemo {

	@Test
	@EnabledOnOs({OS.LINUX,OS.WINDOWS})
	@EnabledOnJre(JRE.JAVA_8)
	void test_for_Linux_And_Windows() {
		System.out.println("Running on Linux and Windows");
	}
	
	@Test
	@EnabledOnOs({OS.LINUX})
	void test_for_Linux() {
		System.out.println("Running on Linux");
	}
	
	@Test
	@EnabledOnOs(OS.WINDOWS)
	@EnabledOnJre(JRE.JAVA_9)
	void test_for_Windows() {
		System.out.println("Running on Linux and Windows");
	}

}

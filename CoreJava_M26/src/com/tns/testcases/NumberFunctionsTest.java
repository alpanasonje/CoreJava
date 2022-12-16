package com.tns.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class NumberFunctionsTest {

	/*
	 * @Test void test() { fail("Not yet implemented"); }
	 */

	@Test
	void test1()
	{
		long expected=720;
		long actual;
		actual=NumberFunctions.newFactorial(6);
		assertEquals(expected,actual);
	}
	
	@Disabled
	@Test
	void test2()
	{
		long expected=720;
		long actual;
		actual=NumberFunctions.newFactorial(-6);
		assertEquals(expected,actual);
	}
	
	@Test
	void test3()
	{
		long expected=1;
		long actual;
		actual=NumberFunctions.newFactorial(0);
		assertEquals(expected,actual);
	}
	@Test
	void test4()
	{
		long expected=120;
		long actual;
		actual=NumberFunctions.newFactorial(5);
		assertEquals(expected,actual);
	}
	@Test
	void test5()
	{
		long expected=-120;
		long actual;
		actual=NumberFunctions.newFactorial(-5);
		assertEquals(expected,actual);
	}
	
	@Test
	void test6()
	{
		float expected=58.333333f;
		float actual;
		actual=NumberFunctions.getPer(45, 70, 60);
		assertEquals(expected,actual);
	}
	@Test
	void test7()
	{
		float expected=70.0f;
		float actual;
		actual=NumberFunctions.getPer(70, 70, 70);
		assertEquals(expected,actual);
	}
	@Test
	void test8()
	{
		float expected=0;
		float actual;
		actual=NumberFunctions.getPer(120, 70, 60);
		assertEquals(expected,actual);
	}
	@Test
	void test9()
	{
		float expected=0;
		float actual;
		actual=NumberFunctions.getPer(-88, 70, 60);
		assertEquals(expected,actual);
	}
	
	@ParameterizedTest
	@ValueSource(ints= {120,-24})
	void test10(int s1)
	{
		float expected=0;
		float actual;
		actual=NumberFunctions.getPer(s1,60,60);
		assertEquals(expected,actual);
	}
	
}

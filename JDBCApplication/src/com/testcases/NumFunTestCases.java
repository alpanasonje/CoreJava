package com.testcases;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import com.corejava.NumberFunctions;
import com.jdbc.UsingCallableStmt;



//@Disabled
class NumFunTestCases {

//	@Disabled
	@Test
	void test1()
	{
		int expected=120;
		int actual=NumberFunctions.factorial(5);
		assertEquals(expected, actual);
	}
	
	@Test
	void test2()
	{
		int actual=NumberFunctions.isPalindrome(1221);
		int expected=1;
		assertEquals(expected,actual);		
	}
	@Test
	void test3()
	{
		int actual=NumberFunctions.isPalindrome(115);
		int expected=0;
		assertEquals(expected,actual);		
	}
}

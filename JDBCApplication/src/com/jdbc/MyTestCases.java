package com.jdbc;

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



//@Disabled
class MyTestCases {

//	@Disabled
	
	@Test
	void test() {
	 
		if (UsingCallableStmt.getName()==null)
			fail("Rollno not found");
			
	}
	
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
		int n=NumberFunctions.isPalindrome(1221);
		if (n==1)	
			System.out.println("Palindrome");
		else
			fail("Number is not Palindrome");
	}

}

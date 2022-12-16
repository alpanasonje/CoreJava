package com.tns.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class DatabaseTest {

	

	@Test
	void test() {
		
		boolean actual=DatabaseFunctions.addPerson(280, "Meena");
		assertTrue(actual);
	}
	@Test
	void test1() {
		
		boolean actual=DatabaseFunctions.addPerson(-5676, "Sau");
		assertFalse(actual);
	}
	
	@ParameterizedTest
	@ValueSource(ints= {-1, 0})
	void test3(int id)
	{
		boolean actual=DatabaseFunctions.addPerson(id,"Mansi");
		assertFalse(actual);
	}
}

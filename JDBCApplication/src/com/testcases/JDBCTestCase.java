package com.testcases;

import static org.junit.Assert.fail;

import org.junit.jupiter.api.Test;

import com.jdbc.UsingCallableStmt;

public class JDBCTestCase {
	@Test
	void test() {
	 
		if (UsingCallableStmt.getName()==null)
			fail("No such student exists..");			
	}
}

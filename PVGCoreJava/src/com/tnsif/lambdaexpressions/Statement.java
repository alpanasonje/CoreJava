//Program to demonstrate Functional Interface

package com.tnsif.lambdaexpressions;

@FunctionalInterface // interface is declared with only one abstract method
interface Statement {
	public String show();// abstract Method
	
}
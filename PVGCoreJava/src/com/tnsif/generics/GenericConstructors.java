//Program to demonstrate generic constructors
package com.tnsif.generics;

public class GenericConstructors {
private double v;

//Generic Constructors
public <T extends Number>GenericConstructors(T t)
{
	v=t.doubleValue();
}

void show()
{
	System.out.println("Value of v in double type is: "+v);
}


public static void main(String[] args) {
	  System.out.println("Number to Double Conversion:");
	  GenericConstructors obj=new GenericConstructors(10);
	  obj.show();
	  
	  GenericConstructors obj1=new GenericConstructors(136.8F);
	  obj1.show();
	}
}
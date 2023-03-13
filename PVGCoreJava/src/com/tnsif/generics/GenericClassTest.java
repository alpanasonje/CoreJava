//Program to demonstrate user defined generic class
package com.tnsif.generics;

//Generic Class
class GenericTest<T>
{
	T data;
	void set(T data)
	{
		this.data=data;
	}
	
	T get()
	{
		return data;
	}
}

public class GenericClassTest {

	public static void main(String[] args) {
		GenericTest<String> obj=new GenericTest<String>();
		obj.set("Hello");
		System.out.println(obj.get());
		
		GenericTest<Integer> obj1=new GenericTest<Integer>();
		obj1.set(10);
		System.out.println(obj1.get());
		
		GenericTest<Person> obj2=new GenericTest<Person>();
		obj2.set(new Person("Nikhil", "Mumbai"));
		System.out.println(obj2.get());
	}

}
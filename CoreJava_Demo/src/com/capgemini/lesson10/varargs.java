package com.capgemini.lesson10;

import static java.lang.System.*;

public class varargs {
	/*addition of only 2 nos
	static int add(int a, int b)
	{
		return a+b;
	}
	*/
	static int add(int... n)
	{
		int s=0;
		for(int i:n)
		{
			s+=i;
		}
		return s;
	}
	static void print(int a, int y, String... s) {
		out.println(a + "," + y);
		for (int i = 0; i < s.length; i++)
			out.print(s[i] + "\t");
		out.println();
	}

	public static void main(String[] arg) {
		//print(3, 2, "java", "java 5");
		//out.println("Next invoke");
		//print(1, 2, "a", "b", "c", "d", "e");
		System.out.println(add(10,20,30,40));
		System.out.println(add(67));
		System.out.println(add(56,80));
		System.out.println(add(50,60,70,10,20,30,40));
		print(10,20,"Java","jdbc","hibernate","spring","react");
		
	}
}

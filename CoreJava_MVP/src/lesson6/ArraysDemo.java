package lesson6;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArraysDemo {

	public static void main(String[] args) {
		display(10,20,30);
		display();
	//	display({1,2,3});
		int num[]= {12,54,77,43,87,14};
	//	List l1=Arrays.asList(num);
		/*
		 * System.out.println("Size of list "+l1.size()); Iterator i=l1.iterator();
		 * while(i.hasNext()) System.out.println(i.next().toString());
		 */
		for(int n:num)
			System.out.print(n+"\t");
		System.out.println("------------------------------");
		Arrays.sort(num);
		for(int n:num)
			System.out.print(n+"\t");
		System.out.println("-----------------------");
		System.out.println(Arrays.binarySearch(num, 13));

	}
	static void display(int ...a)
	{
		if (a.length==0)
			System.out.println("No elements supplied..");
		else
		{
		System.out.println("Array elements.....");
		for(int n:a)
			System.out.print(n+"\t");
		}
	}

}

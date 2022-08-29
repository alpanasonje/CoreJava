package com.sample; //package

public class prg4 //class
{
	public static void main(String args[] )//(arguments/parameters) //main - function or method
	{
		int a[]; //declaration
		int n=10;
		a=new int[n]; //instantiation
		
		//int b[]=new int[10];	
		
		//displaying the array
		for(int i=0;i<n;i++)
			System.out.print(a[i]+"\t");
		System.out.println();
		
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+"\t");
		System.out.println();
		
		//assigning values in a
		for(int i=0;i<a.length;i++)
			a[i]=5*i;
		
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+"\t");
		System.out.println();
		
		int b[]= {10,20,30,40,50}; //initialization at the time of declaration
		for(int i=0;i<b.length;i++)
			System.out.print(b[i]+"\t");
		System.out.println();
		
		b[2]=999; //assigning single element
		for(int i=0;i<b.length;i++)
			System.out.print(b[i]+"\t");
		System.out.println();
		//10 , 20, 999, 40, 50
		//odd:1 , even:4
		int oddcount=0, evencount=0;
		for(int i=0;i<b.length;i++)
		{
			if (b[i]%2 == 0)
				evencount++;
			else
				oddcount++;
		}
		
		System.out.println("Odd numbers : "+oddcount+"\tEven numbers : "+evencount);
		System.out.println();
		System.out.println("---------------------------------------");
	}
	
}

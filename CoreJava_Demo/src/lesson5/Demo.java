package lesson5;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		int i;
		for(i=0;i<10;i++); //null loop
			System.out.print(i+" ");
		for(i=10;i>=1;i--,System.out.println("Hello"+i));
		int a[]= {11,22,33}; //static array 
		int b[]=new int[10]; //static array
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c[]=new int[n]; //static array
		System.out.println("Length of a "+a.length);
		for(i=0;i<a.length;i++); // 3 times
		System.out.println(i); //i=3
		i--; //i=2
		while(i>=0)
		{
			System.out.println(a[i]);
			i--;
		}
		
		}
		
	}



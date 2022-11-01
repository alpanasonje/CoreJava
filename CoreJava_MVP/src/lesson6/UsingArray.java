package lesson6;

import java.util.Scanner;

public class UsingArray {
	public static void main(String args[]) {
		int n;
		Scanner sc=new Scanner(System.in); 
		/*
		 System.out.println("Enter how many numbers "); n=sc.nextInt();
		 */
		 
		n=Integer.parseInt(args[0]);
		int a[]=new int[n];
		System.out.println("size of array"+a.length);
		
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println("-------------------------");
		System.out.println("Enter "+n+" numbers ");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
		System.out.println("-------------------------");
		a=new int [2];
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println("-------------------------");
		a=new int[10];
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println("-------------------------");
		
		int b[]= {100,200,400};
		for(int i=0;i<b.length;i++)
			System.out.print(b[i]+" ");
		System.out.println("-------------------------");
		/*
		 * for(int i=0;i<10;i++) System.out.print(b[i]+" ");
		 * System.out.println("-------------------------");
		 */
		for(int no:b)
			System.out.println(no);
		String courses[]={"Core Java","Hibernate", "Spring Boot", "React"};
		for(String s:courses)
			System.out.println(s);
	}
}

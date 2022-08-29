package com.sample;

public class prg3 {

	public static void main(String[] args) {
		/*float r=3.5f;
		double a;
		a=Math.PI* r * r;
		System.out.println("area of circle is "+a);
		System.out.println("area of circle is "+a+" of radius "+r);*/
	/*	
		int no=15, ans;
		for(int i=1;i<=10;i++)
		{
			ans = no * i;
			System.out.println(no+" * "+i+" = "+ans);
		}
*/
		
		int no=7, fact = 1, i;
		//1
		for(i=1;i<=no;i++)
			fact=fact*i;
		System.out.println("Factorial of "+no+" is "+fact);
		//2
		//fact 5040
		fact =1;
		for(i=no; i>0; i--)
			fact=fact*i;
		System.out.println("Factorial of "+no+" is "+fact);
		System.out.println("i = "+i);
		
		//3 
		fact =1;
		System.out.print("Factorial of "+no);
		while(no>0)
		{
			fact= fact * no;
			no--;
		}
		System.out.println(" is "+fact);
	}

}

// area of circle is ----- of radius -----
//area of circle is 28.274333882308138 of radius 3

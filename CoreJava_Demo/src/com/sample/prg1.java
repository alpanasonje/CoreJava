package com.sample;

public class prg1 {
   //class is a collection of variables and methods 
	public static void main(String[] args) //program execution starts here
	{
		int P;
		float N, R, SI;
		P = 12080;
		N = 2.5f;
		R = (float)7.2;
		SI=P * N * R / 100;
		System.out.println("Simple Interest is "+SI);
		
		//loops - performing repeated task
		/* for loop
		 * while loop
		 * do..while loop
		 */
		//i++ i=i+1  i+=1
		//i++ increase by 1
		//++i increase by 1
		//i=i+2 i+=2
		int i;
		for(i=0;i<=25;i+=5)
		{
			System.out.println("Hello"+i);
		}
		
		for(i=10;i>=1;i--)
			System.out.println(i);

		
		int a=10,b;
		b=a++;
		System.out.println("a = "+a+" b "+b);
		a=10;
		b=++a;
		System.out.println("a = "+a+" b "+b);
		
	}

}

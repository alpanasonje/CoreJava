package com.tns.testcases;

public class NumberFunctions {

	public static float getSimpleInterest(int principalAmt, float rateOfInterest, float noOfYears) {
		return (principalAmt * rateOfInterest * noOfYears) / 100;
	}

	public static long factorial(int n) {
		int f = 1;
		for (int i = 1; i <= n; i++)
			f = f * i;
		return f;
	}

	public static long newFactorial(int n) {
		int f = 1;
		while (n != 0) {
			f = f * n;
			if (n < 0)
				n++;
			else
				n--;
		}

		return f;
	}
	
	public static float getPer(int s1, int s2, int s3)
	{
		float per=0.0f;
		if((s1>=0 && s1<=100) && (s2>=0 && s2<=100) && (s3>=0 && s3<=100))
				per=(s1+s2+s3)/3.0f;
		return per;
	}

}

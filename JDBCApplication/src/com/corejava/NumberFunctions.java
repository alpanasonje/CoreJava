package com.corejava;

public class NumberFunctions {
	public static int factorial(int no)
	{
		if (no<0)
			return -1;
		else if(no==0 || no==2)
			return 1;
		else
			return no*factorial(no-1);
	}
	
	public static int isPalindrome(int no)
	{
        int d,rev=0,no1=no;
        while(no!=0)
        {
        	d=no%10;
        	no=no/10;
        	rev=rev*10+d;
        }
        if (no1==rev)
        	return 1;
        else
        	return 0;
        		
        		
        		/*no 1243
        		find out its reverse
        		   - find out its digits 
            no    	D    R=0        		   
        	123	3    0*10+3=3
        	12	4    3*10+4=34
        	1	2    34*10+2=342
        	0	1    342*10+1=3421
        		
        		*/
        		
	}
}

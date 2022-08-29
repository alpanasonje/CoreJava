package lesson3.iteration;

import java.util.Scanner;

public class WhileEg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// loop - repeatative action
		int i=0;
		while(i<10)
		{
	        System.out.print(i + " ");
	        //i+=2; 
	        i--;
	        if(i==-5)
	        	break; //come out from loop
	    }
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		while(n>5)
		{
		   	System.out.println("n = "+n);
		   	n=n/2;		
		}
	}

}

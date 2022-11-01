package lesson5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TimeDemo {

	public static void main(String[] args) throws IOException {
		long start, end;
		start=System.currentTimeMillis();
		for(int i=0;i<=1000000;i++);
		end=System.currentTimeMillis();
		System.out.println("Elapsed Time : "+(end-start));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int no,sum=0;
		System.out.println("Enter numbers upto 999...");
		do
		{
			no=Integer.parseInt(br.readLine());
			if(no==999)
				break;
			sum+=no;
		}while(no!=999);
		System.out.println("Sum of numbers is "+sum);;		
	}

}

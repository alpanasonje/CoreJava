package lesson5;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner("1 2 3 4 5 7 8");
		int no;
		while(sc.hasNextInt())
		{
			no=sc.nextInt();
			System.out.println(no +" : "+no*no);
		}
		System.out.println("------------------------------------");
		//sc=new Scanner("Nashik, Pune, Mumbai");
		sc=new Scanner("Nashik, Pune, Mumbai").useDelimiter(", ");
		while(sc.hasNext())
			System.out.println(sc.next());
		System.out.println("------------------------------------");
		sc=new Scanner("1. 2. 3. 4. 5").useDelimiter(". ");
		while(sc.hasNextInt())
			System.out.println(sc.nextInt());
		System.out.println("------------------------------------");
		
	}

}

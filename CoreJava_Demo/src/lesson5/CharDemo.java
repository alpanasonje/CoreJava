package lesson5;

import java.util.Scanner;

/**
 * This program demonstrate on how to extract character array from string 
 * and it shows different utility methods of wrapper Character class
 */

public class CharDemo {

	
	public static void main(String[] args) {
		//scanner object to accept input from user
		Scanner scanner = new Scanner(System.in);
		
		//accept the data from user
		System.out.print("Please enter your name:");
		String input = scanner.nextLine();
		char a[]=input.toCharArray();
		//we'll count the number of upper case and lower case characters in a name entered by user
		
		for(int i=0;i<a.length;i++)
		   System.out.print(a[i]+"\t");
			
		int upperCharCount = 0;
		int lowerCharCount = 0;
		System.out.println("Your input : "+input);
		
		//for each
		
		/*for(char ch:a)
		{
			//System.out.println(ch);
			if (Character.isUpperCase(ch))
				upperCharCount++;
			else if (Character.isLowerCase(ch))
				lowerCharCount++;
		}
		*/
		//String class's isEmpty() is used to check whether string is empty or not
		if(!input.isEmpty()) {
			
			//toCharArray() method on String is useful to grab character array from string
			for(char ch:input.toCharArray()) {
				
				//Character wrapper class provides lots of utility method to perform different checks on character
				if(!Character.isDigit(ch) && Character.isAlphabetic(ch)) 
				{
					if(Character.isUpperCase(ch)) 
					{
						upperCharCount++;
					}
					else 
					{
						lowerCharCount++;
					}
				}
			}
			
			
			
		}
		System.out.println("Uppercase Characters:"+upperCharCount);
		System.out.println("Lowercase characters:"+lowerCharCount);
		System.out.println("End of Program...");
		
		//Don't forget to release the resources before your program ends
		scanner.close();
	}
}

package com.capgemini.lesson10;

class CharArrayDemo {
	public static void main(String args[]) {
		char charArray[] = {'a', 'b', '5', '?', 'A', ' '};

		for(int counter=0; counter<charArray.length; counter++) {
			if(Character.isDigit(charArray[counter]))
				System.out.println(charArray[counter] + " is a digit.");
  			if(Character.isLetter(charArray[counter]))
				System.out.println(charArray[counter] + " is a letter.");
			if(Character.isWhitespace(charArray[counter]))
				System.out.println(charArray[counter] + " is whitespace.");
			if(Character.isUpperCase(charArray[counter]))
				System.out.println(charArray[counter] + " is uppercase.");
			if(Character.isLowerCase(charArray[counter]))
				System.out.println(charArray[counter] + " is lowercase.");
		}
	}
}
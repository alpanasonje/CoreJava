package tns.day8;


public class StringDemo {

	public static void main(String[] args) {
		//Strings are immutable
		String str="Hello"; //creates a string with Hello messaage
		System.out.println("String is "+str);
		
		str=new String(); //creates an empty string
		System.out.println("String is "+str);
		
		str=new String("World"); //creates a string with World message
		System.out.println("String is "+str);
		
		String str1=str; //creates a string from an existing string;
		System.out.println("String is "+str1);
		System.out.println(str.equals(str1));
		
		char ch[]= {'H','i'};
		
		str=new String(ch); //creates a string from an character array
		System.out.println("String is "+str);
		
		System.out.println("Character at 0 position is "+str.charAt(0));
		str=str.concat(" Hello! How are you?");
		System.out.println("String is "+str);
		System.out.println(str.equals(str1));
		
		System.out.println(str.indexOf("H"));
		System.out.println(str.lastIndexOf("H"));
		System.out.println(str.indexOf("H",1));
		System.out.println(str.indexOf("Z",1)); //-1 not found
		
		System.out.println("Length of "+str+" is "+str.length());
		System.out.println("String in lower case is "+str.toLowerCase());
		System.out.println("String in upper case is "+str.toUpperCase());
		
		String s[]=str.split(" ");
		for(String ss:s)
			System.out.println(ss);
			
		System.out.println(str.startsWith("Hi"));
		System.out.println(str.endsWith(".?"));
		
		str="      Java          ";
		System.out.println("Before Trim :"+str);
		System.out.println("After Trim :"+str.trim());
		

	}

}

package lession7;
import java.util.Scanner;
import java.util.regex.*;
public class RegExDemo {

	public static void main(String[] args) throws Exception{
		Pattern pattern = Pattern.compile("\\d*");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input : ");
		String inputStr=sc.nextLine();
		
		  Matcher matcher = pattern.matcher(inputStr);
		  System.out.println(matcher.matches()); while (matcher.find()){
		  System.out.println(matcher.group() + ": " +matcher.start() + ": " +
		  matcher.end()); }
		 
		
		  String inputStr1 = "Test     String"; String pattern1 = "Test String"; boolean
		  patternMatched1 =Pattern.matches(pattern1,inputStr1);
		  System.out.println(patternMatched1);
		 
		validateCode(inputStr);
	}
	public static void validateCode(String args) throws Exception{
		String input = "Exo1";
		//Checks for string that start with upper case alphabet and end with digit.
		Pattern p = Pattern.compile("^[A-Z]");
		Matcher m = p.matcher(input);
		if (m.find()) {
		System.err.println("Enter code which start with upper case alphabet and end with a digit");
		}
		}

}

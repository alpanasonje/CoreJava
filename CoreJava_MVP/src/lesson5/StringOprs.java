package lesson5;

public class StringOprs {

	public static void main(String[] args) {
		String s1="    The String class represents character strings.";
		//Allstring literals in Java programs, such as \"abc\", areimplemented as instances of this class. "
		System.out.println("Length "+s1.length());
		System.out.println("Character at 5 "+s1.charAt(5));
		System.out.println("Index of r "+s1.indexOf("r"));
		System.out.println("Index of z "+s1.indexOf("z"));
		System.out.println("Index of re"+s1.indexOf("re"));
	//	System.out.println("Character at 70"+s1.charAt(70));
		System.out.println("Last Index of r "+s1.lastIndexOf("r"));
		System.out.println(s1.endsWith("."));
		System.out.println("*"+s1);
		System.out.println("*"+s1.trim());
		String s2="Hello";
		String s3=s2.toLowerCase();
		System.out.println(s2.equals(s3));
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println(s1.indexOf("r", 6));
		
		
	}

}

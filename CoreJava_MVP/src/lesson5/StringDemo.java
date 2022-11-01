package lesson5;

public class StringDemo {

	public static void main(String[] args) {
		char c[] = {'J', 'a', 'v', 'a'};
		String s1 = new String(c); // String constructor using
		String s2 = new String(s1);
		// String constructor using string as arg.
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("Length of String s2 : " + s2.length());
		System.out.println("Index of v : " + s2.indexOf('v'));
		System.out.println("s2 in uppercase : " + s2.toUpperCase());
		System.out.println("Character at position 2 is : " + s2.charAt(1));
		// Using concatenation to prevent long lines.
		String longStr = "This could have been " +
		"a very long line that would have " +
		"wrapped around. But string concatenation " +
		"prevents this.";
		System.out.println(longStr);
		String str1 = "Hello";
		String str2 = new String(str1);
		System.out.println(str1 + " equals " + str2 + " -> " +
		str1.equals(str2));
		System.out.println(str1 + " == " + str2 + " -> " + (str1 ==str2));
		StringBuffer sb = new StringBuffer(str1);
		sb.append("def");
		System.out.println("sb = " + sb); // output is "sb = abcdef"
		System.out.println(sb.append(str1.toUpperCase()));

	}

}

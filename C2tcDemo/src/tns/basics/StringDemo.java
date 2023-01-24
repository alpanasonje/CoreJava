package tns.basics;

public class StringDemo {
	// using StringBuffer
	public static String substr(String str, int s, int e) {
		StringBuffer sb = new StringBuffer();
		for (int i = s; i < e; i++)
			sb.append(str.charAt(i));
		return sb.toString();
	}

	// using character array
	public static String substr1(String str, int s, int e) {
		char ch[] = new char[e - s];
		for (int i = s, j = 0; i < e; i++, j++)
			ch[j] = str.charAt(i);
		return new String(ch);

	}

	public static void main(String args[]) {
		System.out.println("Computer".substring(3, 5)); //inbuilt
		System.out.println(substr("Computer", 3, 5)); 
		System.out.println(substr1("Computer", 3, 5));
	}
}

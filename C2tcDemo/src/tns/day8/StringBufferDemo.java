package tns.day8;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		String str = "Hello! How are you?";
		sb = new StringBuffer(str);
		System.out.println(sb.capacity());
		sb.append("*******");
		System.out.println(sb.toString());
		System.out.println(sb.capacity());
		System.out.println("Reverse is "+sb.reverse());
		sb.replace(1,5,">");
		System.out.println(sb.toString());

	}

}

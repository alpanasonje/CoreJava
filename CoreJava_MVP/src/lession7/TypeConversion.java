package lession7;

public class TypeConversion {

	public static void main(String[] args) {
		int a=10;
		Integer i1=a;//autoboxing
		int b=i1; //auto-unboxing
		System.out.println(a);
		System.out.println(i1);
		System.out.println(b);
		String s="12";
		a=Integer.parseInt(s);
		i1=Integer.valueOf(s);
		System.out.println(a);
		System.out.println(i1);
	}

}

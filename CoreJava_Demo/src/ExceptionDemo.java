

public class ExceptionDemo {

	public static void main(String[] args) {
		try
		{
			/*
			 * String s="Hi"; s=null; System.out.println(s.equals("hello"));
			 */
		int a,b;
		float c;
		a=Integer.parseInt(args[0]);
		b=0;
		c=a/b;
		System.out.println("division is "+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("----------------------------------");
	}

}

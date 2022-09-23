
public class ExceptionDemo {

	public static void main(String[] args) {
		try {
			
			int a, b;
			float c;
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);;
			c = a / b;
			System.out.println("division is " + c);
			String s="Hi"; System.out.println(s.equals("hello"));
			s=null; System.out.println(s.equals("hello"));
		} catch (ArithmeticException e) {
			System.out.println("error ...."+e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("error... "+e.getMessage());
		}
		System.out.println("----------------------------------");
	}

}

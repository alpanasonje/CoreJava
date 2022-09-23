//using try..catch and finally block

public class UsingExceptionHandling {

	public static void main(String[] args) {
		try {
			String s = "Hi";
			System.out.println(s.equals("hello")); 
			s = null;
			System.out.println(s.equals("hello")); //throws error
		} catch (NullPointerException e) {
			System.out.println("error occurred..." + e.getMessage());
		}
		finally
		{
			System.out.println("I am in Finally block");
		}
		System.out.println("-----------------------End Of Program Execution--------------------");
	}
}

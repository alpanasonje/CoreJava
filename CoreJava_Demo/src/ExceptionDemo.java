//Multiple Catch Block Demo
public class ExceptionDemo {

	public static void main(String[] args) {
		try {
			int a, b;
			float c;
			a = Integer.parseInt(args[0]);// Accepting input from command line argument
			b = Integer.parseInt(args[1]);// if no input supplies then throw ArrayIndexOutofBoundsException
			c = a / b; // divide by zero error when b=0
			System.out.println("division is " + c);	
		}
		//Multiple catch block
        //Gives compile time error 		
		/*
		 * catch(Exception e) { System.out.println("Error.."+e); }
		 */
		catch (ArithmeticException e) {
			System.out.println(e);
		} 
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("oops "+e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Error.."+e);
		}
		System.out.println("-----------------------------------------------------------------------");
	}
}

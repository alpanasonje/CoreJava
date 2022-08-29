package lesson2;

public class ProgramForDebugging {

	int firstNumber,secondNumber;
	/**
	 * This method is to be debugged
	 * Intentionally value of loop variable is changed inside loop
	 * Participants may not know about "for loop" at this stage,
	 * however instructor need to put in the picture that it is to understand 
	 * how to use debugger
	 */
	public void testMe()
	{
		for(int counter=0; counter<20; counter++)
		{
			System.out.println("Value of i is "+ counter);
			System.out.println("Value of first number is "+ firstNumber);
			System.out.println("Value of second number is "+ secondNumber);
			/* Put break points on below lines */
			counter+=4; //counter=counter+4;
			firstNumber++;
			secondNumber+=3;
			/* End of break points */
		}
	}
	
	public static void main(String[] args) {
		

		ProgramForDebugging object=new ProgramForDebugging();
		object.testMe();
	}

}

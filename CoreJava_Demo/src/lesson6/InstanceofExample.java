package lesson6;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class InstanceofExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object testObject = LocalDate.now();
	    if (testObject instanceof LocalDate)
	      System.out.println("Object was an instance of the class java.time.LocalDate");
	    else if (testObject instanceof LocalDateTime)
	      System.out.println("Object was an instance of the class java.time.LocalDateTime");
	    else
	      System.out.println("Object was an instance of the " + testObject.getClass());

	  
	}

}

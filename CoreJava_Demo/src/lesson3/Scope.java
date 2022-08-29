package lesson3;

public class Scope {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int outer = 1;

	    {
	      int inner = 2;
	      System.out.println("inner = " + inner);
	      System.out.println("outer = " + outer);
	    }
	  
	    int inner = 3;
	    System.out.println("inner = " + inner);
	    System.out.println("outer = " + outer);	    
	  }
}

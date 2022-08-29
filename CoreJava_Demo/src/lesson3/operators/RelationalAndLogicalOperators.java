package lesson3.operators;
import java.util.Random;

public class RelationalAndLogicalOperators {
	/**
	 * @param args
	 */

	public static void main(String[] args) {
	    Random rand = new Random();
	    int i = rand.nextInt(100);
	    int j = rand.nextInt(100);
	    System.out.println("i = " + i);
	    System.out.println("j = " + j);
	    System.out.println("i > j is " + (i > j));
	    System.out.println("i < j is " + (i < j));
	    System.out.println("i >= j is " + (i >= j));
	    System.out.println("i <= j is " + (i <= j));
	    System.out.println("i == j is " + (i == j));
	    System.out.println("i != j is " + (i != j));

	    System.out.println("(i < 10) && (j < 10) is " + ((i < 10) && (j < 10)));
	    System.out.println("(i < 10) || (j < 10) is " + ((i < 10) || (j < 10)));
	  }
}

package lesson3.operators;

public class CommaOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1, j = i + 10; i < 5; i++, j = i * 2) 
		{
      System.out.println("i= " + i + " j= " + j);
		}
	}
}

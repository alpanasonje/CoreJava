package lesson7.interfacedemo;

//By default it is public
interface Food {

	
	/*By default variables are public static final*/
	String who_m_i="I am Eatable";
	 
	/* Variables with only public or without (not default) specifier are allowed
	 * Hence, following code which worked for abstract class, will NOT work here
	 * private String who_m_i="I am Eatable";
	 * protected String who_m_i= "I am Eatable";
	 * and
	 * String who_m_i="I am Eatable"; is same as
	 * public String who_m_i="I am Eatable"; is same as
	 * static public String who_m_i="I am Eatable"; is same as
	 * public static final String who_m_i="I am Eatable";
	 */
	
	/* Interface does not have any implementation
	 * Hence, it does not have constructor
	 * Object of an Interface can not be created
	 * Hence, following code which worked for abstract class will produce
	 * compilation error
	 * public Food()
		{
		System.out.println("IS A FOOD");
		}
	 */
	
	/*
	 * By default, methods in interface 
	 * are public and abstract, no need to explicitly specify it
	 * hence, following lines are same as 
	 * public abstract String consume();
	   public abstract String taste();
	   as we have used in abstract class Food.	
	 */
	String consume();
	String taste();
	
	/* abstract class can also have non abstract methods
	 * with any access specifier, but interface can not
	 * have private, protected methods hence, following code
	 * which worked for abstract class will not work here.
	 *
	 *protected void prepareToEat()
		{
		wash();
		System.out.println("clean your hands");
		}
	
	  private void wash()
		{
		System.out.println("Have you washed your hands");
		}
	 */
}

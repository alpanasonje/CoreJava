package lesson7.interfacedemo;

/* Interface can EXTEND another interface
 * But, class can only IMPLEMENT one or more Interfaces
 */
public abstract class Spicy implements Food {

	public Spicy()
	{
		System.out.println("IS SPICY");
	}
	
	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "Spicy";
	}

}

package abstractdemo;

public abstract class Spicy extends Food {

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

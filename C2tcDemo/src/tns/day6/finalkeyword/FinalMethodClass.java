package tns.day6.finalkeyword;

public class FinalMethodClass {
	public void show()
	{
		System.out.println("Hello");
	}
	public final void display()
	{
		System.out.println("Final Method");
	}
}

class Child extends FinalMethodClass
{
	@Override
	public void show()
	{
		System.out.println("Hello! How are you?");
	}
	
	//Final method cannot override
	//@Override
	/*public void display()
	{
		System.err.println("In Display ");
	}*/
}
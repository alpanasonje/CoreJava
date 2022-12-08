public class ProtectedDemo
{
	public static void main(String args[])
	{
		Derived d1=new Derived();
		d1.methodPublic();
		/* only public methods are accessible
		d1.methodPrivate();
		d1.methodDefault();
		d1.methodProtected();
		*/
	}
}
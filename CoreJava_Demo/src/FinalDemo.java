

final class A
{
	public final void show()
	{
		System.out.println("Show of A");
	}
}
/*class B extends A
{
//	@Override
	//public void show()
	//{
		//System.out.println("Show of B");
	//}
}
*/

public class FinalDemo {

	public static void main(String[] args) {
		final int i=10; //constant
		System.out.println("i = "+i);
		/*i++;
		System.out.println("i = "+i);
*/
		A a1=new A();
		a1.show();
	}
}

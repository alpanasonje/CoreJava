public class ForLoop {
	public static void main(String args[])
	{
		SwitchDemo d1=new SwitchDemo();
		d1.show();
		for(int i=0;i<=3;i+=2) //i -loop variable
		{
			System.out.println("Java Programming "+i);//0
			i++;//1
		}
		SwitchDemo.main(args);
		d1.show();
	}
}

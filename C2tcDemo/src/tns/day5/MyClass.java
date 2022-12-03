package tns.day5;

public class MyClass {
	int srNo; //non-static or instance variable
	static int cnt; //static or class variable
	//static Block
	static
	{
		System.out.println("-----------Within Static Block---------");
		cnt=1000;
	}
	
	MyClass()
	{
		System.out.println("--------------Within Default Constructor-----------");
		this.srNo++;
		cnt++;		
	}
	public void show() //non static method
	{
		System.out.println("Serial No. "+srNo);		
		System.out.println("Count : "+cnt);
	}
	static void display() //static method
	{
		System.out.println("Count : "+cnt);
		//System.out.println("Serial No. "+srNo); can't access non static members	
	}
}

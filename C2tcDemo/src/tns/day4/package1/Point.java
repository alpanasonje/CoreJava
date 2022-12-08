//demonstrate access modifiers
package tns.day4.package1;

public class Point {
	private float x;
	private float y;
	
	//Constructor Overloading
	public Point() //Default Constructor
	{
		this.x=0.0f;
		this.y=0.0F;
		System.out.println("Default Constructor");
	}
	public Point(float x)
	{
		this.x=x; this.y=x;
	}
	public Point(float x,float y)//Parameterized Constructor
	{
		this();
		this.x=x;
		this.y=y;
	}
	public void show()
	{
		System.out.println("Point ("+x+", "+y+")");
	}

}

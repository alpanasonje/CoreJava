package tns.day4.package1;

public class PointDemo {
	public static void main(String[] args) {
		/*Compile time polymorphism / static binding / earling binding
	     Ex: Constructor Overloading and Method Overloading
		*/
		
		Point p1=new Point();  //default constructor
	//	p1.x=5.8f; private members can't accessible
		
		p1.show();
		Point p2=new Point(2.5f); // one parameter constructor
		p2.show();
		Point p3=new Point(12.5f, -7.4f); // two parameters constructor
		p3.show();
		}
}

package tns.day4.package1;

public class PointDemo {
	public static void main(String[] args) {
		Point p1=new Point();
	//	p1.x=5.8f; private members can't accessible
		
		p1.show();
		Point p2=new Point(2.5f);
		p2.show();
		Point p3=new Point(12.5f, -7.4f);
		p3.show();
		}
}

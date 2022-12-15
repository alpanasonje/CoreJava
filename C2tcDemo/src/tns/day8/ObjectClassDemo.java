package tns.day8;

class Point {
	private float x, y;

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public Point(float x, float y) {
		System.out.println("parameterised Constructor");
		this.x = x;
		this.y = y;
	}

	public Point() {
		super();
		System.out.println("Default Constructor");
		x = 0.0f;
		y = 0.0f;

	}

	@Override
	public String toString() {
		return "Point (" + x + ", " + y + ")";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object is being destroyed");
	}

}

public class ObjectClassDemo {

	public static void main(String[] args) {
		Point p1 = new Point();
		System.out.println("p1 Point is : " + p1.toString());

		Point p2 = new Point(10.20f, 45.70f);
		System.out.println("p2 Point is : " + p2);

		p1 = null;
		

		//p2 = null;

		System.gc();
		System.out.println("P1 point is "+p1);
		System.out.println("p2 Point is : " + p2);
	}

}

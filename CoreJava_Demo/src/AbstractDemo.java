
import java.util.Scanner;

abstract class Shape {
	protected float area;
	protected final float PI = 3.14f;
	protected String shapeName;

	public void show() {
		System.out.println("Area is " + area);
	}

	public abstract void calArea();
}

class Circle extends Shape {
	private float radius;

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public Circle(float radius) {
		super();
		this.radius = radius;
		shapeName = "Circle";
	}

	public Circle() {
		super();
		radius = 2.5f;
		shapeName = "Circle";
	}

	@Override
	public void calArea() {
		area = super.PI * radius * radius;
	}
}

class Cylinder extends Shape {
	private float radius;
	private float height;

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public Cylinder(float radius, float height) {
		super();
		this.radius = radius;
		this.height = height;
		shapeName = "Cylinder";
	}

	public Cylinder() {
		super();
		shapeName = "Cylinder";
	}

	@Override
	public void calArea() {

		area = 2 * PI * radius * (radius + height);
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		Shape s1;
		Circle c1;
		Cylinder cl1;
		/*
		 * c1=new Circle(); c1.calArea(); System.out.println(c1.shapeName); c1.show();
		 * 
		 * cl1=new Cylinder(); cl1.setHeight(10); cl1.setRadius(5f); cl1.calArea();
		 * System.out.println(cl1.shapeName); cl1.show();
		 */
		int ch;
		do {
			System.out.println("-----MENU-------");
			System.out.println("1.Circle");
			System.out.println("2.Cylinder");
			System.out.println("3. Exit");
			System.out.println("Please enter your choice.. ");
			Scanner sc = new Scanner(System.in);
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				s1 = new Circle(3.5f);
				System.out.println(s1.shapeName);
				s1.calArea();
				s1.show();
				break;
			case 2:
				s1 = new Cylinder(12f, 5f);
				System.out.println(s1.shapeName);
				s1.calArea();
				s1.show();
				break;
			case 3:
				System.out.println("Terminated...");
				System.exit(0);
			default:
				System.out.println("Invalid choice...");
			}
		} while (ch != 3);
	}
}

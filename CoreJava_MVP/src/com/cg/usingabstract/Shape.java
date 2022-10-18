package com.cg.usingabstract;

public abstract class Shape {
	protected float area;
	protected static final float PI=3.14f;
	
	void show()
	{
		System.out.println("Area of shape is "+area);
	}
	abstract float calArea();

}

class Circle extends Shape
{
	private float radius;
	@Override
	float calArea() {
		area=PI*radius*radius;
		return area;
	}
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	
}


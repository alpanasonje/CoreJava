package com.cg.usingabstract;

public class Square extends Shape{
	private float side;
	@Override
	float calArea() {
		area=side*side;
		return area;
	}
	public float getSide() {
		return side;
	}
	public void setSide(float side) {
		this.side = side;
	}

}

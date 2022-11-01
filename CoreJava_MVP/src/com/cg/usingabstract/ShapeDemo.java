package com.cg.usingabstract;

public class ShapeDemo {

	public static void main(String[] args) {
		//Shape ss=new Shape();
		Shape ss;
		Circle c1;
		c1=new Circle();
		c1.setRadius(2.5f);
		c1.calArea();
		c1.show();
		Square s1=new Square();
		s1.setSide(2.5f);
		s1.calArea();
		s1.show();
		
		
		
	}

}

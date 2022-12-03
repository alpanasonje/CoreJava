package com.cg.demo;

class Point {
	int x, y;

	Point() {
		x = 0;
		y = 0;
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point(" + x + ", " + y + ")";
	}

}

public class PointDemo {
	public static void main(String[] args) {

		Point p1 = new Point();
		Point p2 = new Point(10, 60);
		System.out.println(p1);
		System.out.println(p2);
	}
}

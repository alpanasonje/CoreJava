package com.capgemini.lesson4;

class Box {
	
	double dblWidth;
	double dblHeight;
	double dblDepth;

	public Box(double dblWidth, double dblHeight, double dblDepth) {
		super();
		this.dblWidth = dblWidth;
		this.dblHeight = dblHeight;
		this.dblDepth = dblDepth;
	}

	public Box() {
		super();
		//dblWidth = dblHeight = dblDepth = 0.0
	}

	
	double calcVolume() {
		return dblWidth * dblHeight * dblDepth;
	} //method calcVolume ends.

	public double getDblWidth() {
		return dblWidth;
	}

	public void setDblWidth(double dblWidth) {
		this.dblWidth = dblWidth;
	}

	public double getDblHeight() {
		return dblHeight;
	}

	public void setDblHeight(double dblHeight) {
		this.dblHeight = dblHeight;
	}

	public double getDblDepth() {
		return dblDepth;
	}

	public void setDblDepth(double dblDepth) {
		this.dblDepth = dblDepth;
	}
}//class Box ends.


class BoxDemo {
	public static void main(String a[]) {
		Box box1; //declare a reference to object
		box1 = new Box(); //allocate a memory for box object.
		System.out.println(box1.calcVolume());
		
		Box box2 = new Box(10,20,30);		//invoke constructor
		System.out.println(box2.calcVolume());
		
		Box box3 = new Box();
		box3.setDblDepth(1);			//invoke setter methods
		box3.setDblHeight(2);
		box3.setDblWidth(3);
		System.out.println(box3.calcVolume());
	} 
}

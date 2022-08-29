package com.capgemini.lesson4;

class StaticBox {
	
	/*
	 * instance variables / non static variables - associated with 
	 * instance(object). Every object/instance having separate copy 
	 * of its instance variables
	 * 
	 */
	double dblWidth;
	double dblHeight;
	double dblDepth;
	
	/*
	 * static variable / class variable - associated with class
	 * only one copy of static/class variable is created and 
	 * all objects of that class shares the same copy
	 */
	static int count;
    //parameterized Constructor
	public StaticBox(double dblWidth, double dblHeight, double dblDepth) {
		super();
		
		this.dblWidth = dblWidth; 
		this.dblHeight = dblHeight;
		this.dblDepth = dblDepth;
		count++;
	}
    //Default Constructor
	public StaticBox() {
		super();
		/*
		 * local variable cnt
		 */
		int cnt=0;
		cnt++;
		System.out.println("cnt is "+cnt);
		count++;
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


class StaticBoxDemo {
	public static void main(String a[]) {
		StaticBox box1; //declare a reference to object
		box1 = new StaticBox(); //allocate a memory for box object.
		System.out.println(box1.calcVolume());
		StaticBox box2 = new StaticBox(10,20,30);		//invoke constructor
		System.out.println(box2.calcVolume());
		
		StaticBox box3 = new StaticBox();
		box3.setDblDepth(1);			//invoke setter methods
		box3.setDblHeight(2);
		box3.setDblWidth(3);
		System.out.println(box3.calcVolume());
		System.out.println("Total boxes created :"+StaticBox.count);
	} 
}

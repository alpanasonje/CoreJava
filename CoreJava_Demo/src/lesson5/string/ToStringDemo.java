package lesson5.string;

class Box {
	double width;
	double height;
	double depth;

	Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	public String toString() {
		return "Dimensions are " + width + " by " + depth + " by " + height
				+ ".";
	}
}

class ToStringDemo {
	public static void main(String args[]) {
		Box box = new Box(10, 12, 14);
		// concatenate Box object by calling toString() method on box object.
		String str = "Box b: " + box;

		// concatenate Box object by calling toString() method on box object.
		System.out.println(box); // convert Box to string
		System.out.println(str);
	}
}

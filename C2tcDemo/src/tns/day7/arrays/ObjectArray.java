package tns.day7.arrays;

public class ObjectArray {
	public static void main(String args[]) {
		Student st[] = { new Student(10, "Dhruv", 78), new Student(11, "Aniket", 63), new Student(12, "Meet", 72) };
		for (Student s : st)
			System.out.println(s);
	}
}

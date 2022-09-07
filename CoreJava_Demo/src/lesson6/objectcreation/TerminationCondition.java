package lesson6.objectcreation;

class Book {

	Book() {
		System.out.println("I am in constructor");
	}

	void x()
	{
		System.out.println("U R IN METHOD X");
	}

	public void finalize() {
		System.out.println("In finalize method");
	}
}

public class TerminationCondition {
	public static void main(String[] args) {
		Book novel = new Book();
		// Proper cleanup:
		novel.x();
		// Drop the reference, forget to clean up:
		new Book();
		// Force garbage collection & finalization:
		System.gc();
		System.runFinalization();
	}
} ///:~



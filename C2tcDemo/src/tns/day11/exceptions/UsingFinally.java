package tns.day11.exceptions;

public class UsingFinally {
	public static void show(int a[]) {
		int i, sum = 0;
		try {
			for (i = 0; i < a.length; i++) {
				System.out.println(a[i]);
				sum = sum + a[i];
			}
			
			//a[3] = 12;
			System.exit(0);
		} catch (Exception e) {
			System.out.println("Error...." + e.getMessage());
		} finally {
			System.out.println("In Finally Block");
		}

	}

	public static void main(String[] args) {
		int a[] = { 10, 20, 30 };
		show(a);
	}

}

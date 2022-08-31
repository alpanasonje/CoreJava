package lesson5;

import java.util.Scanner;

public class ParseString {

	public static void main(String[] args) {
		String numbers="12,5,8,3,9,10";
		//String numbers="1 2 3 4";
		Scanner scanner = new Scanner(numbers).useDelimiter(",");
		while (scanner.hasNextInt()) {
			int num = scanner.nextInt();
			if (num % 2 != 0) {
				System.out.println(num);
			}
		}
		scanner.close();
	}
}

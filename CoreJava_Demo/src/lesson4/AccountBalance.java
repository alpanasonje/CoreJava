package lesson4;

import lesson4.demo.Balance;

class AccountBalance {
	public static void main(String args[]) {

		Balance current = new Balance("Amit", 300);
		current.show();
		Balance current1 = new Balance("Meet", 0);
		current1.show();
	}
}

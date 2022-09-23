

public class AccountDemo {

	public static void main(String[] args) {
		Account a1=new Account(101,"Amit","Pune",67000);
		a1.showBalance();
		a1.deposit(5000);
		a1.showBalance();
		a1.withdraw(23000);
		a1.showBalance();
		a1.withdraw(55000);
		a1.showBalance();

	}

}

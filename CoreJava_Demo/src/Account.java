
public class Account extends Person implements Bank
{
	private int balance;
	private int accNo;
	
	
	public Account() {
		super();
		
	}

	public Account(int accNo, String name, String city,int balance) {
		super(name,city);
		this.balance = balance;
		this.accNo = accNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	@Override
	public void showBalance() {
		System.out.println("Account No : "+accNo+" Current Balance is "+balance);	
	}

	@Override
	public void deposit(int amt) {
		balance+=amt;	
		System.out.println("Amount("+amt+") deposited successfully....");
	}

	@Override
	public void withdraw(int amt) {
		if (balance-amt>=1000)
		{
		balance-=amt;		
		System.out.println("Amount("+amt+") withdraw successfully....");
		}
		else
		{
			System.out.println("Withdrawal fail....");
		}
			
	}

}

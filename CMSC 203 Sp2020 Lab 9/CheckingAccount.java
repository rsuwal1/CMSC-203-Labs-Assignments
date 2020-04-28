
public class CheckingAccount extends BankAccount {
	
	private double FEE = 0.15;
	private String accountNumber;

	
	public CheckingAccount(String name, double amt) {
		
		super(name, amt);
		this.accountNumber = this.getAccountNumber() + "-10";
		this.setAccountNumber(this.accountNumber);
	}

	public boolean withdraw(double withdrawl) {
		
		if (withdrawl > this.getBalance()) { return false; }
		if (withdrawl + (this.FEE) > this.getBalance()) { return false; }

		
		boolean result = super.withdraw(withdrawl + (this.FEE));

		
		return result;
	}
}
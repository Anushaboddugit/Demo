package testing;
import java.lang.Exception;
public class BankAccount {
	private double balance;
	public BankAccount(double balance)
	{
		this.balance=balance;
	}
	public double getBalance() {
		return balance;
	}
	public void withdraw(double amount) throws InsufficientFundsException {
		if(amount>balance) {
			throw new InsufficientFundsException("insufficient funds to withdraw");
		}
		balance=balance-amount;
	}
	public class InsufficientFundsException extends Exception{
		public InsufficientFundsException(String message) {
			super(message);
		}
	}
}


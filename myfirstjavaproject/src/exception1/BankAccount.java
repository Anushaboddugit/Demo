package exception1;
import java.util.Scanner;

class InsufficientBalanceException extends RuntimeException{
	public InsufficientBalanceException(String message) {
		super(message);
	}
}
class IllegalBankTransaction extends RuntimeException{
	public IllegalBankTransaction(String message) {
		super(message);
	}
}
        class BankSavings{
        	private long id;
        	private double balance;
        	public BankSavings(long id,double initialBalance) {
        		this.id=id;
        		this.balance=initialBalance;
        	}
        	public double withdraw(double amount) {
        		if(amount<0) {
        			throw new IllegalBankTransaction("negative withdrawal amount is not allowed");
        		}
        		if(balance==0||amount>balance) {
        			throw new InsufficientBalanceException("insufficient balance");
        		}
        		balance=balance-amount;
        		return balance;	
        	}
        	public double deposit(double amount) {
        		if(amount<0) {
        			throw new IllegalBankTransaction("negative withdrawal amount is not allowed");
        		}
        		balance=balance+amount;
        		return balance;
        	}
        	public double getBalance() {
        		return balance;
        	}
        }

		public class BankAccount{
			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				BankSavings obj=new BankSavings(102,5000);
				System.out.println("enter the amount to withdraw");
				double withdrawAmount=sc.nextDouble();
				try {
				double amt=obj.withdraw(withdrawAmount);
				System.out.println("withdrawal sucessfull");
				System.out.print("new balance: "+obj.getBalance());
				}
				 catch (InsufficientBalanceException e) {
			            System.out.println("Insufficient balance: " + e.getMessage());
			        }
				catch (IllegalBankTransaction e) {
			            System.out.println("Illegal bank transaction: " + e.getMessage());
			        }
				finally {
					sc.close();
				}
			}	
		}
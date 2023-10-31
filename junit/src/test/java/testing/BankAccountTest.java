package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import testing.BankAccount.InsufficientFundsException;

class BankAccountTest {

	@Test
	@DisplayName(" test to check it is returning correct balance amoount")
	void test() throws InsufficientFundsException {
		BankAccount bankAccount=new BankAccount(30000);
		bankAccount.withdraw(2000);
		assertEquals(28000,bankAccount.getBalance());
	}
	@Test
	@DisplayName(" test to check whether the method throwing somekind of exception")
	void testException() throws InsufficientFundsException {
		BankAccount bankAccount=new BankAccount(10000);
		assertThrows(InsufficientFundsException.class, () -> 
	            bankAccount.withdraw(20000));
	}
}

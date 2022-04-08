package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest2 {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	@Test
	void testbalance1()  {
        BankAccount bankAccount=new BankAccount();
        assertThrows(InsufficientFundsException.class,()-> bankAccount.withdraw(10000));
    }

}

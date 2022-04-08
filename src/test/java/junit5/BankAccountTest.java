package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BankAccountTest {
    @Test
    void testbalance() throws InsufficientFundsException {
        BankAccount bankAccount=new BankAccount();
        Integer actual=bankAccount.withdraw(1000);
        assertEquals(4000,actual);
    }
    @Test
    void testbalance1()  {
        BankAccount bankAccount=new BankAccount();
        assertThrows(InsufficientFundsException.class,()-> bankAccount.withdraw(10000));
    }
}
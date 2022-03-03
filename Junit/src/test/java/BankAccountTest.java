import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    @Test
    void Withdraw() throws InsufficientBalanceException {
        assertThrows(InsufficientBalanceException.class,() -> BankAccount.withdraw(800));
        assertEquals(500, BankAccount.withdraw(100));
        System.out.println(BankAccount.withdraw(100));
    }

}
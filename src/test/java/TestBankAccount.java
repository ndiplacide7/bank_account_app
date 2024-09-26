import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestBankAccount {
    @Test
    public void shouldReturnCorrectBalance() {
        BankAccount account = new BankAccount(100);
        assertEquals(100, account.getBalance());
    }

    @Test
    public void shouldDepositCorrectAmount() {
        BankAccount account = new BankAccount(100);
        account.deposit(50);
        assertEquals(150, account.getBalance());
    }

    @Test
    public void shouldWithdrawCorrectAmount() {
        BankAccount account = new BankAccount(100);
        account.withdraw(50);
        assertEquals(50, account.getBalance());
    }

    @Test
    public void shouldTransferCorrectAmount() {
        BankAccount account1 = new BankAccount(100);
        BankAccount account2 = new BankAccount(100);
        account1.transfer(account2, 50);
        assertEquals(50, account1.getBalance());
        assertEquals(150, account2.getBalance());
    }
}


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    private Account account;

    @BeforeEach
    public void setup(){
        account = new Account();
    }



    @Test
    public void depositNegativeAmount_balanceRemainsUnchangedTest(){
        assertEquals( 0, account.getBalance());
        account.deposit(-50_000);
        assertEquals( 0, account.getBalance());

    }
    @Test
    public void deposit2000AccountBalanceChangesTest(){
        assertEquals(0, account.getBalance());
        account.deposit(2000);
        assertEquals(2000, account.getBalance());
    }
    @Test
    public void testToWithdrawNegativeAmountAndBalanceRemainsUnchanged(){
        assertEquals(0, account.getBalance());
        account.withDraw(-20_000);
        assertEquals(0, account.getBalance());

    }
    @Test
    public void testThatWhenMyBalanceIs1200AndiWithdraw1000MyBalanceChanges(){
        account.deposit(1200);
        assertEquals(1200, account.getBalance());
        account.withDraw(1000);
        assertEquals(200, account.getBalance());
    }
    @Test
    public void testThatWhenMyBalanceIs200AndIWithdraw50_000MyBalanceRemainsUnchange(){
        account.deposit(200);
        account.withDraw(50_000);
        assertEquals(200, account.getBalance());
    }
}
